package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object includesHealthPlanFormulary extends PropertyDef(
        iri = "http://schema.org/includesHealthPlanFormulary",
        iris = Set("http://schema.org/includesHealthPlanFormulary"),
        label = "includesHealthPlanFormulary",
        comment = """Formularies covered by this plan.""",
        `@extends` = () => List(),
        `@range` = () => List(HealthPlanFormulary.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}