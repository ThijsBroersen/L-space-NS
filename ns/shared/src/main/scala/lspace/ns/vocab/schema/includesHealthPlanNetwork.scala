package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object includesHealthPlanNetwork extends PropertyDef(
        iri = "http://schema.org/includesHealthPlanNetwork",
        iris = Set("http://schema.org/includesHealthPlanNetwork"),
        label = "includesHealthPlanNetwork",
        comment = """Networks covered by this plan.""",
        `@extends` = () => List(),
        `@range` = () => List(HealthPlanNetwork.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}