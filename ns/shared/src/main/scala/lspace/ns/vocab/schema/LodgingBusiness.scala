package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object LodgingBusiness extends OntologyDef(
        iri = "http://schema.org/LodgingBusiness",
        iris = Set("http://schema.org/LodgingBusiness"),
        label = "LodgingBusiness",
        comment = """A lodging business, such as a motel, hotel, or inn.""",
        `@extends` = () => List(LocalBusiness.ontology)
       ){
}