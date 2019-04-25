package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object fromLocation
    extends PropertyDef(
      iri = "http://schema.org/fromLocation",
      iris = Set("http://schema.org/fromLocation"),
      label = "fromLocation",
      comment = """A sub property of location. The original location of the object or the agent before the action.""",
      `@extends` = () => List(location.property),
      `@range` = () => List(Place.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties extends lspace.ns.vocab.schema.location.Properties
}
