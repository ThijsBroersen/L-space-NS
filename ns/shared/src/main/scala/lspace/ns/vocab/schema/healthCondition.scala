package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object healthCondition extends PropertyDef(
        iri = "http://schema.org/healthCondition",
        iris = Set("http://schema.org/healthCondition"),
        label = "healthCondition",
        comment = """Specifying the health condition(s) of a patient, medical study, or other target audience.""",
        `@extends` = List(),
        `@range` = List(MedicalCondition.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}