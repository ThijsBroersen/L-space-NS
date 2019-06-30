package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object BusStop extends OntologyDef(
        iri = "http://schema.org/BusStop",
        iris = Set("http://schema.org/BusStop"),
        label = "BusStop",
        comment = """A bus stop.""",
        `@extends` = () => List(CivicStructure.ontology)
       ){
}