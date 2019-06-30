package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object OfferItemCondition extends OntologyDef(
        iri = "http://schema.org/OfferItemCondition",
        iris = Set("http://schema.org/OfferItemCondition"),
        label = "OfferItemCondition",
        comment = """A list of possible conditions for the item.""",
        `@extends` = () => List(Enumeration.ontology)
       ){
}