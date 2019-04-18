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
object keys extends lspace.ns.vocab.schema.StructuredValue.Properties{
lazy val enginePower = lspace.ns.vocab.schema.enginePower.property
}
override lazy val properties: List[LProperty] = List(enginePower)
trait Properties extends lspace.ns.vocab.schema.StructuredValue.Properties{
lazy val enginePower = lspace.ns.vocab.schema.enginePower.property
}
}