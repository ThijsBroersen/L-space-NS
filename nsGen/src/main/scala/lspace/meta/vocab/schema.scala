package lspace.meta.vocab

import lspace._
import lspace.codec.{ActiveContext, Decoder}
import lspace.codec.argonaut._
import lspace.datatype.DataType
import lspace.structure.{Graph => _, _}
import monix.eval.Task

import scala.meta._
import scala.meta.prettyprinters.Show

object schema {

  val graph: Graph     = Graph("https://schema.org")
  val decoder: Decoder = Decoder(graph.ns)

  def saveToFile(path: String, code: Tree) = {
    val writer = new java.io.PrintWriter(path)
    try writer.write(code.syntax)
    finally writer.close()
  }

  def genOntology(path: String, iri: String) =
    decoder
      .toOntology(iri)(ActiveContext())
      .flatMap { ontology =>
        graph
          .nodes()
          .filter(node => node.hasLabel(Ontology.ontology).isEmpty && node.hasLabel(Property.ontology).isEmpty)
          .mapEval { node =>
            println(s"fetch ${node.iri}")
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

  def ontologyToOntologyDef(ontology: Ontology, cname: Option[String] = None): String = {
    val label = cname.getOrElse(ontology.iri.reverse.takeWhile(c => c != '/' && c != '#').reverse)
//      .getOrElse(throw new Exception(s"no 'en' label present for ${ontology.iri} ${ontology.label()}"))
    val comment = ontology
      .comment("en")
      .getOrElse("")
//      .getOrElse(throw new Exception(s"no 'en' label present for ${ontology.iri} ${ontology.label()}"))
    "package lspace.ns.vocab.schema\n" +
      "import lspace.ns.vocab.schema._\n" +
      "import lspace.structure.{Property, OntologyDef}\n" +
      s"""object $label extends OntologyDef(
        iri = "${ontology.iri}",
        iris = ${ontology.iris.map(v => s""""$v"""")},
        label = "${ontology.label("en").getOrElse("")}",
        comment = \"\"\"${comment}\"\"\",
        `@extends` = () => ${ontology
        .extendedClasses()
        .map {
          case c if c.iri.startsWith("@") => s"`${c.iri}`"
          case classes =>
            classes.iri.reverse
              .takeWhile(c => c != '/' && c != '#')
              .reverse + ".ontology"
        }}
       ){""" + "\n" +
      s"""object keys ${if (ontology.extendedClasses().filter(!_.iri.startsWith("@")).nonEmpty)
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
                .reverse + ".Properties")
          .mkString(" with ")
      else ""}""" + "{\n" +
      ontology
        .properties()
        .toList
        .map(_.iris.find(_.startsWith("@") == false).head.reverse.takeWhile(c => c != '/' && c != '#').reverse)
        .map { label =>
          s"lazy val $label = lspace.ns.vocab.schema.${label}"
        }
        .mkString("\n") +
      "}\n" +
      s"""override lazy val properties: List[Property] = ${ontology
        .properties()
        .filter(!_.iri.startsWith("@"))
        .toList
        .map(_.iris.find(_.startsWith("@") == false).head.reverse.takeWhile(c => c != '/' && c != '#').reverse)}""" + "\n" +
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
                .reverse + ".Properties")
          .mkString(" with ")
      else ""}""" + "{\n" +
      ontology
        .properties()
        .filter(!_.iri.startsWith("@"))
        .toList
        .map(_.iris.find(_.startsWith("@") == false).head.reverse.takeWhile(c => c != '/' && c != '#').reverse)
        .map { label =>
          s"lazy val $label = lspace.ns.vocab.schema.${label}"
        }
        .mkString("\n") +
      "}\n" +
      "}"
  }

  def propertyToPropertyDef(property: Property, cname: Option[String] = None): String = {
    val label = cname.getOrElse(property.iri.reverse.takeWhile(c => c != '/' && c != '#').reverse)
//      .getOrElse(throw new Exception(s"no 'en' label present for ${property.iri} ${property.label()}"))
    val comment = property
      .comment("en")
      .getOrElse("")
//      .getOrElse(throw new Exception(s"no 'en' label present for ${property.iri} ${property.label()}"))
    "package lspace.ns.vocab.schema\n" +
      "import lspace.ns.vocab.schema._\n" +
      "import lspace.Label.D._\n" +
      "import lspace.Label.P._\n" +
      "import lspace.structure.{Property, PropertyDef}\n" +
      s"""object $label extends PropertyDef(
        iri = "${property.iri}",
        iris = ${property.iris.map(v => s""""$v"""")},
        label = "${property.label("en").getOrElse("")}",
        comment = \"\"\"${comment}\"\"\",
        `@extends` = () => ${property
        .extendedClasses()
        .map {
          case c if c.iri.startsWith("@") => s"`${c.iri}`"
          case classes =>
            classes.iri.reverse
              .takeWhile(c => c != '/' && c != '#')
              .reverse + ".property"
        }},
        `@range` = () => ${property
        .range()
        .map {
          case c: Ontology =>
            if (c.iri.startsWith("@")) "`" + c.iri + "`"
            else c.iri.reverse.takeWhile(c => c != '/' && c != '#').reverse + ".ontology"
          case c: Property =>
            if (c.iri.startsWith("@")) "`" + c.iri + "`"
            else c.iri.reverse.takeWhile(c => c != '/' && c != '#').reverse + ".property"
          case c: DataType[_] =>
            if (c.iri.startsWith("@")) "`" + c.iri + "`" else c.iri.reverse.takeWhile(c => c != '/' && c != '#').reverse
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
                .reverse)
          .map(_ + ".Properties")
          .mkString(" with ")
      else ""}""" + "\n" +
      s"""override lazy val properties: List[Property] = ${property
        .properties()
        .filter(!_.iri.startsWith("@"))
        .toList
        .map(_.iris.find(_.startsWith("@") == false).head.reverse.takeWhile(c => c != '/' && c != '#').reverse)}""" + "\n" +
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
                .reverse)
          .map(_ + ".Properties")
          .mkString(" with ")
      else ""}""" + "\n" +
      "}"
  }
}
