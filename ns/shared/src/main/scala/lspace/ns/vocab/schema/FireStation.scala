package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object FireStation extends OntologyDef(
        iri = "http://schema.org/FireStation",
        iris = Set("http://schema.org/FireStation"),
        label = "FireStation",
        comment = """A fire station. With firemen.""",
        `@extends` = () => List(CivicStructure.ontology, EmergencyService.ontology)
       ){
}