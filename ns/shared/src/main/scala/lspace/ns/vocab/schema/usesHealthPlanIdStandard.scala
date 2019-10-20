package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object usesHealthPlanIdStandard extends PropertyDef(
        iri = "http://schema.org/usesHealthPlanIdStandard",
        iris = Set("http://schema.org/usesHealthPlanIdStandard"),
        label = "usesHealthPlanIdStandard",
        comment = """The standard for interpreting thePlan ID. The preferred is "HIOS". See the Centers for Medicare &amp; Medicaid Services for more details.""",
        `@extends` = List(),
        `@range` = List(URL.ontology, `@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}