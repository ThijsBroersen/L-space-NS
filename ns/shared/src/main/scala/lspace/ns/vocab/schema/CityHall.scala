package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object CityHall extends OntologyDef(
        iri = "http://schema.org/CityHall",
        iris = Set("http://schema.org/CityHall"),
        label = "CityHall",
        comment = """A city hall.""",
        `@extends` = () => List(GovernmentBuilding.ontology)
       ){
}