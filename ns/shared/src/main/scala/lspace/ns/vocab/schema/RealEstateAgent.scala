package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object RealEstateAgent extends OntologyDef(
        iri = "http://schema.org/RealEstateAgent",
        iris = Set("http://schema.org/RealEstateAgent"),
        label = "RealEstateAgent",
        comment = """A real-estate agent.""",
        `@extends` = () => List(LocalBusiness.ontology)
       ){
}