package lspace.meta.vocab

import lspace._
import lspace.codec.{ActiveContext, Decoder}
import lspace.codec.argonaut._
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
      .map { ontology =>
        Task.gather(
          graph
            .nodes()
            .filter(node => node.hasLabel(Ontology.ontology).isEmpty && node.hasLabel(Property.ontology).isEmpty)
            .map { node =>
              decoder.toClasstype(node.iri)(ActiveContext())
            })
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
        label = "$label",
        comment = \"\"\"${comment}\"\"\",
        `@extends` = () => List(${ontology
        .extendedClasses()
        .map(o => o.iris.find(_.startsWith("@") == false).head.reverse.takeWhile(c => c != '/' && c != '#').reverse)
        .mkString(". ")})
       ){""" + "\n" +
      s"""object keys ${if (ontology.extendedClasses().nonEmpty)
        "extends " + ontology
          .extendedClasses()
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
        .toList
        .map(_.iris.find(_.startsWith("@") == false).head.reverse.takeWhile(c => c != '/' && c != '#').reverse)}""" + "\n" +
      s"""trait Properties ${if (ontology.extendedClasses().nonEmpty)
        "extends " + ontology
          .extendedClasses()
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
      "import lspace.structure.{Property, PropertyDef}\n" +
      s"""object $label extends PropertyDef(
        iri = "${property.iri}",
        iris = ${property.iris.map(v => s""""$v"""")},
        label = "$label",
        comment = \"\"\"${comment}\"\"\",
        `@extends` = () => ${property
        .extendedClasses()
        .map(_.iris.find(_.startsWith("@") == false).head.reverse.takeWhile(c => c != '/' && c != '#').reverse)},
        `@range` = () => ${property
        .range()
        .toList
        .map(c =>
          if (c.iri.startsWith("@")) "`" + c.iri + "`" else c.iri.reverse.takeWhile(c => c != '/' && c != '#').reverse)}
       ){""" + "\n" +
      s"""${if (property.extendedClasses().nonEmpty && property.extendedClasses().flatMap(_.properties()).nonEmpty)
        "object keys extends " + property
          .extendedClasses()
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
        .toList
        .map(_.iris.find(_.startsWith("@") == false).head.reverse.takeWhile(c => c != '/' && c != '#').reverse)}""" + "\n" +
      s"""trait Properties ${if (property.extendedClasses().nonEmpty)
        "extends " + property
          .extendedClasses()
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
