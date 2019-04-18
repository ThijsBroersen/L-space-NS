package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object toLocation
    extends PropertyDef(
      iri = "http://schema.org/toLocation",
      iris = Set("http://schema.org/toLocation"),
      label = "toLocation",
      comment = """A sub property of location. The final location of the object or the agent after the action.""",
      `@extends` = () => List(location.property),
      `@range` = () => List(Place.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.location.Properties
}
