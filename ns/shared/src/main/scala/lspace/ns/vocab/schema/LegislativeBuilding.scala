package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object LegislativeBuilding extends OntologyDef(
        iri = "http://schema.org/LegislativeBuilding",
        iris = Set("http://schema.org/LegislativeBuilding"),
        label = "LegislativeBuilding",
        comment = """A legislative building&#x2014;for example, the state capitol.""",
        `@extends` = () => List(GovernmentBuilding.ontology)
       ){
}