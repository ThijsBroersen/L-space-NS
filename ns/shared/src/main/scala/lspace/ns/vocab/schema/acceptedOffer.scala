package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object acceptedOffer
    extends PropertyDef(
      iri = "http://schema.org/acceptedOffer",
      iris = Set("http://schema.org/acceptedOffer"),
      label = "acceptedOffer",
      comment = """The offer(s) -- e.g., product, quantity and price combinations -- included in the order.""",
      `@extends` = () => List(),
      `@range` = () => List(Offer.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
