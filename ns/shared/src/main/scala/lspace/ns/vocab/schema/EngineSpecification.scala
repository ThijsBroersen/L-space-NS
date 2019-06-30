package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object EngineSpecification extends OntologyDef(
        iri = "http://schema.org/EngineSpecification",
        iris = Set("http://schema.org/EngineSpecification"),
        label = "EngineSpecification",
        comment = """Information about the engine of the vehicle. A vehicle can have multiple engines represented by multiple engine specification entities.""",
        `@extends` = () => List(StructuredValue.ontology)
       ){
}