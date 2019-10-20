package lspace.meta.vocab

import lspace._
import lspace.codec.ActiveContext
import lspace.codec.argonaut._
import lspace.codec.json.jsonld.JsonLDDecoder
import lspace.datatype.DataType
import monix.eval.Task

import scala.meta._
import scala.meta.prettyprinters.Show
import scala.concurrent.duration._

object schema {

  val graph: Graph = Graph("https://schema.org/version/3.5/all-layers")
  val decoder      = JsonLDDecoder(graph)

  def saveToFile(path: String, code: Tree) = {
    val writer = new java.io.PrintWriter(path)
    try writer.write(code.syntax)
    finally writer.close()
  }

  val reservedWords = Set("yield", "if", "else", "for", "object")

  def genSchema(path: String): Task[Unit] = decoder.fetchVocabularyGraph(graph.iri)(ActiveContext()).flatMap { f =>
    Task {
      Ontology.ontologies.all.filter(_.iri.contains("schema.org")).foreach { ontology =>
        val code  = ontologyToOntologyDef(ontology)
        val label = ontology.iri.reverse.takeWhile(c => c != '/' && c != '#').reverse
        saveToFile(s"$path${label}.scala", code.parse[Source].get)
      }
      Property.properties.all.filter(_.iri.contains("schema.org")).foreach { property =>
        val code  = propertyToPropertyDef(property)
        val label = property.iri.reverse.takeWhile(c => c != '/' && c != '#').reverse
        saveToFile(s"$path${label}.scala", code.parse[Source].get)
      }
    }.delayExecution(5.seconds)
  }
  def genOntology(path: String, iri: String) =
    decoder
      .toOntology(iri)(ActiveContext())
      .flatMap { ontology =>
        graph
          .nodes()
          .filter(node => node.hasLabel(Ontology.ontology).isEmpty && node.hasLabel(Property.ontology).isEmpty)
          .mapEval { node =>
            decoder.toClasstype(node.iri)(ActiveContext())
          }
          .toListL
      }
      .map { ontology =>
        Ontology.ontologies.all.filter(_.iri.contains("schema.org")).foreach { ontology =>
          val code  = ontologyToOntologyDef(ontology)
          val label = ontology.iri.reverse.takeWhile(c => c != '/' && c != '#').reverse
          saveToFile(s"$path${label}.scala", code.parse[Source].get)
        }
        Property.properties.all.filter(_.iri.contains("schema.org")).foreach { property =>
          val code  = propertyToPropertyDef(property)
          val label = property.iri.reverse.takeWhile(c => c != '/' && c != '#').reverse
          saveToFile(s"$path${label}.scala", code.parse[Source].get)
        }
      }
  def genProperty(path: String, iri: String) =
    decoder
      .toProperty(iri)(ActiveContext())
      .map { ontology =>
        Ontology.ontologies.all.filter(_.iri.contains("schema.org")).foreach { ontology =>
          val code  = ontologyToOntologyDef(ontology)
          val label = ontology.iri.reverse.takeWhile(c => c != '/' && c != '#').reverse
          saveToFile(s"$path${label}.scala", code.parse[Source].get)
        }
        Property.properties.all.filter(_.iri.contains("schema.org")).foreach { property =>
          val code  = propertyToPropertyDef(property)
          val label = property.iri.reverse.takeWhile(c => c != '/' && c != '#').reverse
          saveToFile(s"$path${label}.scala", code.parse[Source].get)
        }
      }

  implicit class WithString(string: String) {
    def validObjectName: String = string match {
      case label if reservedWords.contains(label) => s"`$label`"
      case label if !label.head.isLetter          => s"`$label`"
      case label                                  => label
    }
  }
  def ontologyToOntologyDef(ontology: Ontology, cname: Option[String] = None): String = {
    val label               = cname.getOrElse(ontology.iri.reverse.takeWhile(c => c != '/' && c != '#').reverse).validObjectName
    val inheritedProperties = ontology.extendedClasses.all().toList.flatMap(_.properties().toList)
    val toOverride          = inheritedProperties.groupBy(p => p).filter(_._2.size > 1).keys.toSet.diff(ontology.properties())
//      .getOrElse(throw new Exception(s"no 'en' label present for ${ontology.iri} ${ontology.label()}"))
    val comment = ontology
      .comment("en")
      .getOrElse("")
//      .getOrElse(throw new Exception(s"no 'en' label present for ${ontology.iri} ${ontology.label()}"))
    "package lspace.ns.vocab.schema\n" +
      "import lspace.ns.vocab.schema._\n" +
      "import lspace.structure.{Property => LProperty, OntologyDef}\n" +
      s"""object $label extends OntologyDef(
        iri = "${ontology.iri}",
        iris = ${ontology.iris.map(v => s""""$v"""")},
        label = "${ontology.label("en").getOrElse("")}",
        comment = \"\"\"${comment}\"\"\",
        `@extends` = ${ontology
        .extendedClasses()
        .map {
          case c if c.iri.startsWith("@") => s"`${c.iri}`"
          case classes =>
            try {
              classes.iri.reverse
                .takeWhile(c => c != '/' && c != '#')
                .reverse
                .validObjectName + ".ontology"
            } catch {
              case e =>
                println(ontology.iri)
                println(classes.iri)
                println(classes.iris)
                throw e
            }
        }}
       ){""" + "\n" +
      s"""object keys ${if (ontology.extendedClasses().filter(!_.iri.startsWith("@")).nonEmpty)
        "extends " + ontology
          .extendedClasses()
          .filter(!_.iri.startsWith("@"))
          .map(
            o =>
              "lspace.ns.vocab.schema." + (o.iris
                .find(_.startsWith("@") == false)
                .head
                .reverse
                .takeWhile(c => c != '/' && c != '#')
                .reverse
                .validObjectName) + ".Properties")
          .mkString(" with ")
      else ""}""" + "{\n" +
      (try {
        ontology
          .properties()
          .diff(inheritedProperties.toSet)
          .toList
          .sortBy(_.label("en").getOrElse(""))
          .map(
            _.iris
              .find(_.startsWith("@") == false)
              .head
              .reverse
              .takeWhile(c => c != '/' && c != '#')
              .reverse
              .validObjectName)
      } catch {
        case e =>
          println(ontology.iri)
          println(toOverride.map(_.iri))
          println(toOverride.map(_.iris))
          throw e
      }).map { label =>
          s"lazy val $label = lspace.ns.vocab.schema.${label}.property"
        }
        .mkString("\n") + "\n" +
      (try {
        toOverride.toList
          .map(
            _.iris
              .find(_.startsWith("@") == false)
              .head
              .reverse
              .takeWhile(c => c != '/' && c != '#')
              .reverse
              .validObjectName)
      } catch {
        case e =>
          println(ontology.iri)
          println(toOverride.map(_.iri))
          println(toOverride.map(_.iris))
          throw e
      }).map { label =>
          s"override lazy val $label = lspace.ns.vocab.schema.${label}.property"
        }
        .mkString("\n") +
      "}\n" +
      s"""override lazy val properties: List[LProperty] = ${ontology
        .properties()
        .diff(inheritedProperties.toSet)
        .filter(!_.iri.startsWith("@"))
        .toList
        .sortBy(_.label("en").getOrElse(""))
        .map(
          _.iris
            .find(_.startsWith("@") == false)
            .head
            .reverse
            .takeWhile(c => c != '/' && c != '#')
            .reverse
            .validObjectName)}""" + "\n" +
      s"""trait Properties ${if (ontology.extendedClasses().filter(!_.iri.startsWith("@")).nonEmpty)
        "extends " + ontology
          .extendedClasses()
          .filter(!_.iri.startsWith("@"))
          .map(
            o =>
              "lspace.ns.vocab.schema." + o.iris
                .find(_.startsWith("@") == false)
                .head
                .reverse
                .takeWhile(c => c != '/' && c != '#')
                .reverse
                .validObjectName + ".Properties")
          .mkString(" with ")
      else ""}""" + "{\n" +
      ontology
        .properties()
        .diff(inheritedProperties.toSet)
        .filter(!_.iri.startsWith("@"))
        .toList
        .sortBy(_.label("en").getOrElse(""))
        .map(
          _.iris
            .find(_.startsWith("@") == false)
            .head
            .reverse
            .takeWhile(c => c != '/' && c != '#')
            .reverse
            .validObjectName)
        .map { label =>
          s"lazy val $label = lspace.ns.vocab.schema.${label}.property"
        }
        .mkString("\n") + "\n" +
      toOverride.toList
        .map(
          _.iris
            .find(_.startsWith("@") == false)
            .head
            .reverse
            .takeWhile(c => c != '/' && c != '#')
            .reverse
            .validObjectName)
        .map { label =>
          s"override lazy val $label = lspace.ns.vocab.schema.${label}.property"
        }
        .mkString("\n") +
      "}\n" +
      "}"
  }

  def propertyToPropertyDef(property: Property, cname: Option[String] = None): String = {
    val label = cname.getOrElse(property.iri.reverse.takeWhile(c => c != '/' && c != '#').reverse).validObjectName
//      .getOrElse(throw new Exception(s"no 'en' label present for ${property.iri} ${property.label()}"))
    val comment = property
      .comment("en")
      .getOrElse("")
//      .getOrElse(throw new Exception(s"no 'en' label present for ${property.iri} ${property.label()}"))
    "package lspace.ns.vocab.schema\n" +
      "import lspace.ns.vocab.schema._\n" +
      "import lspace.Label.D._\n" +
      "import lspace.Label.P._\n" +
      "import lspace.structure.{Property => LProperty, PropertyDef}\n" +
      s"""object $label extends PropertyDef(
        iri = "${property.iri}",
        iris = ${property.iris.map(v => s""""$v"""")},
        label = "${property.label("en").getOrElse("")}",
        comment = \"\"\"${comment}\"\"\",
        `@extends` = ${property
        .extendedClasses()
        .map {
          case c if c.iri.startsWith("@") => s"`${c.iri}`"
          case classes =>
            classes.iri.reverse
              .takeWhile(c => c != '/' && c != '#')
              .reverse
              .validObjectName + ".property"
        }},
        `@range` = ${property
        .range()
        .map {
          case c: Ontology =>
            if (c.iri.startsWith("@")) "`" + c.iri + "`"
            else
              (c.iri.reverse.takeWhile(c => c != '/' && c != '#').reverse.validObjectName) + ".ontology"
          case c: Property =>
            if (c.iri.startsWith("@")) "`" + c.iri + "`"
            else
              (c.iri.reverse.takeWhile(c => c != '/' && c != '#').reverse.validObjectName) + ".property"
          case c: DataType[_] =>
            if (c.iri.startsWith("@")) "`" + c.iri + "`"
            else
              c.iri.reverse.takeWhile(c => c != '/' && c != '#').reverse.validObjectName
        }}
       ){""" + "\n" +
      s"""${if (property.extendedClasses().filter(!_.iri.startsWith("@")).nonEmpty && property
                  .extendedClasses()
                  .flatMap(_.properties().filter(!_.iri.startsWith("@")))
                  .nonEmpty)
        "object keys extends " + property
          .extendedClasses()
          .filter(!_.iri.startsWith("@"))
          .map(
            o =>
              "lspace.ns.vocab.schema." + o.iris
                .find(_.startsWith("@") == false)
                .head
                .reverse
                .takeWhile(c => c != '/' && c != '#')
                .reverse
                .validObjectName)
          .map(_ + ".Properties")
          .mkString(" with ")
      else ""}""" + "\n" +
      s"""override lazy val properties: List[LProperty] = ${property
        .properties()
        .filter(!_.iri.startsWith("@"))
        .toList
        .sortBy(_.label("en").getOrElse(""))
        .map(
          _.iris
            .find(_.startsWith("@") == false)
            .head
            .reverse
            .takeWhile(c => c != '/' && c != '#')
            .reverse
            .validObjectName)}""" + "\n" +
      s"""trait Properties ${if (property.extendedClasses().filter(!_.iri.startsWith("@")).nonEmpty)
        "extends " + property
          .extendedClasses()
          .filter(!_.iri.startsWith("@"))
          .map(
            o =>
              "lspace.ns.vocab.schema." + o.iris
                .find(_.startsWith("@") == false)
                .head
                .reverse
                .takeWhile(c => c != '/' && c != '#')
                .reverse
                .validObjectName)
          .map(_ + ".Properties")
          .mkString(" with ")
      else ""}""" + "\n" +
      "}"
  }
}
