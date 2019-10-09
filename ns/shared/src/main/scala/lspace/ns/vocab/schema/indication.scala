package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object indication extends PropertyDef(
        iri = "http://schema.org/indication",
        iris = Set("http://schema.org/indication"),
        label = "indication",
        comment = """A factor that indicates use of this therapy for treatment and/or prevention of a condition, symptom, etc. For therapies such as drugs, indications can include both officially-approved indications as well as off-label uses. These can be distinguished by using the ApprovedIndication subtype of MedicalIndication.""",
        `@extends` = List(),
        `@range` = List(MedicalIndication.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}