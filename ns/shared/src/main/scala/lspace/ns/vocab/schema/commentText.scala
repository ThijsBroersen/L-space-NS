package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object commentText
    extends PropertyDef(
      iri = "http://schema.org/commentText",
      iris = Set("http://schema.org/commentText"),
      label = "commentText",
      comment = """The text of the UserComment.""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
