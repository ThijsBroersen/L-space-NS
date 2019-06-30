package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object BusStation extends OntologyDef(
        iri = "http://schema.org/BusStation",
        iris = Set("http://schema.org/BusStation"),
        label = "BusStation",
        comment = """A bus station.""",
        `@extends` = () => List(CivicStructure.ontology)
       ){
}