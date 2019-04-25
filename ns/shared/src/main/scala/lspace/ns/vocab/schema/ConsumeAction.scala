package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ConsumeAction
    extends OntologyDef(
      iri = "http://schema.org/ConsumeAction",
      iris = Set("http://schema.org/ConsumeAction"),
      label = "ConsumeAction",
      comment = """The act of ingesting information/resources/food.""",
      `@extends` = () => List(Action.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Action.Properties {
    lazy val expectsAcceptanceOf = lspace.ns.vocab.schema.expectsAcceptanceOf.property
  }
  override lazy val properties: List[LProperty] = List(expectsAcceptanceOf)
  trait Properties extends lspace.ns.vocab.schema.Action.Properties {
    lazy val expectsAcceptanceOf = lspace.ns.vocab.schema.expectsAcceptanceOf.property
  }
}
