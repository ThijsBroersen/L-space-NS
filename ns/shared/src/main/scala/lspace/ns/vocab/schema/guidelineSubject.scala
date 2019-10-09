package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object guidelineSubject extends PropertyDef(
        iri = "http://schema.org/guidelineSubject",
        iris = Set("http://schema.org/guidelineSubject"),
        label = "guidelineSubject",
        comment = """The medical conditions, treatments, etc. that are the subject of the guideline.""",
        `@extends` = List(),
        `@range` = List(MedicalEntity.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}