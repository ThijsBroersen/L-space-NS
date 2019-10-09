package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object healthPlanNetworkId extends PropertyDef(
        iri = "http://schema.org/healthPlanNetworkId",
        iris = Set("http://schema.org/healthPlanNetworkId"),
        label = "healthPlanNetworkId",
        comment = """Name or unique ID of network. (Networks are often reused across different insurance plans).""",
        `@extends` = List(),
        `@range` = List(`@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}