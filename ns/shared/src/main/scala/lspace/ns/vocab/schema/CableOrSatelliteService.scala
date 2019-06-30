package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object CableOrSatelliteService extends OntologyDef(
        iri = "http://schema.org/CableOrSatelliteService",
        iris = Set("http://schema.org/CableOrSatelliteService"),
        label = "CableOrSatelliteService",
        comment = """A service which provides access to media programming like TV or radio. Access may be via cable or satellite.""",
        `@extends` = () => List(Service.ontology)
       ){
}