package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object vehicleEngine extends PropertyDef(
        iri = "http://schema.org/vehicleEngine",
        iris = Set("http://schema.org/vehicleEngine"),
        label = "vehicleEngine",
        comment = """Information about the engine or engines of the vehicle.""",
        `@extends` = () => List(),
        `@range` = () => List(EngineSpecification.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}