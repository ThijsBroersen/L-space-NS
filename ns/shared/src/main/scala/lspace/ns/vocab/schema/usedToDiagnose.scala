package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object usedToDiagnose extends PropertyDef(
        iri = "http://schema.org/usedToDiagnose",
        iris = Set("http://schema.org/usedToDiagnose"),
        label = "usedToDiagnose",
        comment = """A condition the test is used to diagnose.""",
        `@extends` = List(),
        `@range` = List(MedicalCondition.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}