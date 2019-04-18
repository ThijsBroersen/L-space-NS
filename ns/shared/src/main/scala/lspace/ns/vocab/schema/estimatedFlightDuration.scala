package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object estimatedFlightDuration
    extends PropertyDef(
      iri = "http://schema.org/estimatedFlightDuration",
      iris = Set("http://schema.org/estimatedFlightDuration"),
      label = "estimatedFlightDuration",
      comment = """The estimated time the flight will take.""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
