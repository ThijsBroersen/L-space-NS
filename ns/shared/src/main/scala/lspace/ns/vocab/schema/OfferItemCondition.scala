package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object OfferItemCondition
    extends OntologyDef(
      iri = "http://schema.org/OfferItemCondition",
      iris = Set("http://schema.org/OfferItemCondition"),
      label = "OfferItemCondition",
      comment = """A list of possible conditions for the item.""",
      `@extends` = () => List(Enumeration.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Enumeration.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.Enumeration.Properties {}
}
