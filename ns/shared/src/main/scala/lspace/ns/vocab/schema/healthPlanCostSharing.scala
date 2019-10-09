package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object healthPlanCostSharing extends PropertyDef(
        iri = "http://schema.org/healthPlanCostSharing",
        iris = Set("http://schema.org/healthPlanCostSharing"),
        label = "healthPlanCostSharing",
        comment = """Whether The costs to the patient for services under this network or formulary.""",
        `@extends` = List(),
        `@range` = List(`@boolean`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}