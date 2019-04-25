package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object availableAtOrFrom
    extends PropertyDef(
      iri = "http://schema.org/availableAtOrFrom",
      iris = Set("http://schema.org/availableAtOrFrom"),
      label = "availableAtOrFrom",
      comment = """The place(s) from which the offer can be obtained (e.g. store locations).""",
      `@extends` = () => List(areaServed.property),
      `@range` = () => List(Place.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties extends lspace.ns.vocab.schema.areaServed.Properties
}
