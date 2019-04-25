package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object itemCondition
    extends PropertyDef(
      iri = "http://schema.org/itemCondition",
      iris = Set("http://schema.org/itemCondition"),
      label = "itemCondition",
      comment =
        """A predefined value from OfferItemCondition or a textual description of the condition of the product or service, or the products or services included in the offer.""",
      `@extends` = () => List(),
      `@range` = () => List(OfferItemCondition.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
