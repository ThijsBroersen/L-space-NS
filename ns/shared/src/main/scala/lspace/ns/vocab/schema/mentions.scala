package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object mentions
    extends PropertyDef(
      iri = "http://schema.org/mentions",
      iris = Set("http://schema.org/mentions"),
      label = "mentions",
      comment = """Indicates that the CreativeWork contains a reference to, but is not necessarily about a concept.""",
      `@extends` = () => List(),
      `@range` = () => List(Thing.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
