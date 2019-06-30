package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object EmergencyService extends OntologyDef(
        iri = "http://schema.org/EmergencyService",
        iris = Set("http://schema.org/EmergencyService"),
        label = "EmergencyService",
        comment = """An emergency service, such as a fire station or ER.""",
        `@extends` = () => List(LocalBusiness.ontology)
       ){
}