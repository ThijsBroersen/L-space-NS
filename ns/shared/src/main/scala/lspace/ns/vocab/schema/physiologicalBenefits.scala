package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object physiologicalBenefits extends PropertyDef(
        iri = "http://schema.org/physiologicalBenefits",
        iris = Set("http://schema.org/physiologicalBenefits"),
        label = "physiologicalBenefits",
        comment = """Specific physiologic benefits associated to the plan.""",
        `@extends` = List(),
        `@range` = List(`@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}