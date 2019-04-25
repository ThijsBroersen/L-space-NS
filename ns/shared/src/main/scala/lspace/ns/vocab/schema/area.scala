package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object area
    extends PropertyDef(
      iri = "http://schema.org/area",
      iris = Set("http://schema.org/area"),
      label = "area",
      comment = """The area within which users can expect to reach the broadcast service.""",
      `@extends` = () => List(),
      `@range` = () => List(Place.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
