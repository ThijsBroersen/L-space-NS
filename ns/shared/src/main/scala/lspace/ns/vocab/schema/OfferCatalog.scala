package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object OfferCatalog
    extends OntologyDef(
      iri = "http://schema.org/OfferCatalog",
      iris = Set("http://schema.org/OfferCatalog"),
      label = "OfferCatalog",
      comment =
        """An OfferCatalog is an ItemList that contains related Offers and/or further OfferCatalogs that are offeredBy the same provider.""",
      `@extends` = () => List(ItemList.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.ItemList.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.ItemList.Properties {}
}
