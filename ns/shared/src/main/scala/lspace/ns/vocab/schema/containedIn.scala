package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object containedIn
    extends PropertyDef(
      iri = "http://schema.org/containedIn",
      iris = Set("http://schema.org/containedIn"),
      label = "containedIn",
      comment = """The basic containment relation between a place and one that contains it.""",
      `@extends` = () => List(),
      `@range` = () => List(Place.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
