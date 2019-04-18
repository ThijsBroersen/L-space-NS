package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object isbn
    extends PropertyDef(
      iri = "http://schema.org/isbn",
      iris = Set("http://schema.org/isbn"),
      label = "isbn",
      comment = """The ISBN of the book.""",
      `@extends` = () => List(identifier.property),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.identifier.Properties
}
