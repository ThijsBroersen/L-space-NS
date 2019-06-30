package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object GovernmentBuilding extends OntologyDef(
        iri = "http://schema.org/GovernmentBuilding",
        iris = Set("http://schema.org/GovernmentBuilding"),
        label = "GovernmentBuilding",
        comment = """A government building.""",
        `@extends` = () => List(CivicStructure.ontology)
       ){
}