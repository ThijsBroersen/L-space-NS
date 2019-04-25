package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object makesOffer
    extends PropertyDef(
      iri = "http://schema.org/makesOffer",
      iris = Set("http://schema.org/makesOffer"),
      label = "makesOffer",
      comment = """A pointer to products or services offered by the organization or person.""",
      `@extends` = () => List(),
      `@range` = () => List(Offer.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
