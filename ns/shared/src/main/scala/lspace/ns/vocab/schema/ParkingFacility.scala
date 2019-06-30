package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ParkingFacility extends OntologyDef(
        iri = "http://schema.org/ParkingFacility",
        iris = Set("http://schema.org/ParkingFacility"),
        label = "ParkingFacility",
        comment = """A parking lot or other parking facility.""",
        `@extends` = () => List(CivicStructure.ontology)
       ){
}