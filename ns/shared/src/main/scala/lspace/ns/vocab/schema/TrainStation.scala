package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object TrainStation extends OntologyDef(
        iri = "http://schema.org/TrainStation",
        iris = Set("http://schema.org/TrainStation"),
        label = "TrainStation",
        comment = """A train station.""",
        `@extends` = () => List(CivicStructure.ontology)
       ){
}