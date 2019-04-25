package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object printEdition
    extends PropertyDef(
      iri = "http://schema.org/printEdition",
      iris = Set("http://schema.org/printEdition"),
      label = "printEdition",
      comment = """The edition of the print product in which the NewsArticle appears.""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
