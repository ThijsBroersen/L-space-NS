package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Embassy extends OntologyDef(
        iri = "http://schema.org/Embassy",
        iris = Set("http://schema.org/Embassy"),
        label = "Embassy",
        comment = """An embassy.""",
        `@extends` = () => List(GovernmentBuilding.ontology)
       ){
}