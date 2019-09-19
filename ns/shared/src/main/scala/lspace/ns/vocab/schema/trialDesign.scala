package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object trialDesign extends PropertyDef(
        iri = "http://schema.org/trialDesign",
        iris = Set("http://schema.org/trialDesign"),
        label = "trialDesign",
        comment = """Specifics about the trial design (enumerated).""",
        `@extends` = () => List(),
        `@range` = () => List(MedicalTrialDesign.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}