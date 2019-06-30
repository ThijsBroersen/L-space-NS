package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object hasOfferCatalog extends PropertyDef(
        iri = "http://schema.org/hasOfferCatalog",
        iris = Set("http://schema.org/hasOfferCatalog"),
        label = "hasOfferCatalog",
        comment = """Indicates an OfferCatalog listing for this Organization, Person, or Service.""",
        `@extends` = () => List(),
        `@range` = () => List(OfferCatalog.ontology)
       ){
}