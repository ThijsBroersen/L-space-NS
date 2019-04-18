package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object reviewBody
    extends PropertyDef(
      iri = "http://schema.org/reviewBody",
      iris = Set("http://schema.org/reviewBody"),
      label = "reviewBody",
      comment = """The actual body of the review.""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
