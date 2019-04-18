package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object linkRelationship
    extends PropertyDef(
      iri = "http://schema.org/linkRelationship",
      iris = Set("http://schema.org/linkRelationship"),
      label = "linkRelationship",
      comment = """Indicates the relationship type of a Web link.""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
