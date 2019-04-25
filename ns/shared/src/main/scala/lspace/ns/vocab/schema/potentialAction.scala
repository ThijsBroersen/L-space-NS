package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object potentialAction
    extends PropertyDef(
      iri = "http://schema.org/potentialAction",
      iris = Set("http://schema.org/potentialAction"),
      label = "potentialAction",
      comment =
        """Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.""",
      `@extends` = () => List(),
      `@range` = () => List(Action.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
