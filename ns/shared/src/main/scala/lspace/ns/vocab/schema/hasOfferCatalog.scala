package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object hasOfferCatalog extends PropertyDef(
        iri = "https://schema.org/hasOfferCatalog",
        iris = Set("https://schema.org/hasOfferCatalog"),
        label = "hasOfferCatalog",
        comment = """Indicates an OfferCatalog listing for this Organization, Person, or Service.""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}