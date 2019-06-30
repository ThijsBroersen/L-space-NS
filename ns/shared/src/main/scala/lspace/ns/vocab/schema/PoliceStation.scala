package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object PoliceStation extends OntologyDef(
        iri = "http://schema.org/PoliceStation",
        iris = Set("http://schema.org/PoliceStation"),
        label = "PoliceStation",
        comment = """A police station.""",
        `@extends` = () => List(EmergencyService.ontology, CivicStructure.ontology)
       ){
}