package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object TouristInformationCenter extends OntologyDef(
        iri = "http://schema.org/TouristInformationCenter",
        iris = Set("http://schema.org/TouristInformationCenter"),
        label = "TouristInformationCenter",
        comment = """A tourist information center.""",
        `@extends` = () => List(LocalBusiness.ontology)
       ){
}