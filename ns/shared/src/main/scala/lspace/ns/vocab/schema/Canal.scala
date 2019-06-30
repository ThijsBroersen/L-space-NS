package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Canal extends OntologyDef(
        iri = "http://schema.org/Canal",
        iris = Set("http://schema.org/Canal"),
        label = "Canal",
        comment = """A canal, like the Panama Canal.""",
        `@extends` = () => List(BodyOfWater.ontology)
       ){
}