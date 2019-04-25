package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object aircraft
    extends PropertyDef(
      iri = "http://schema.org/aircraft",
      iris = Set("http://schema.org/aircraft"),
      label = "aircraft",
      comment = """The kind of aircraft (e.g., "Boeing 747").""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology, Vehicle.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
