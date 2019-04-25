package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object containedInPlace
    extends PropertyDef(
      iri = "http://schema.org/containedInPlace",
      iris = Set("http://schema.org/containedInPlace"),
      label = "containedInPlace",
      comment = """The basic containment relation between a place and one that contains it.""",
      `@extends` = () => List(),
      `@range` = () => List(Place.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
