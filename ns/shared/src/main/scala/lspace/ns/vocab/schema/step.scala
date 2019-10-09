package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object step extends PropertyDef(
        iri = "http://schema.org/step",
        iris = Set("http://schema.org/step"),
        label = "step",
        comment = """A single step item (as HowToStep, text, document, video, etc.) or a HowToSection.""",
        `@extends` = List(),
        `@range` = List(HowToStep.ontology, HowToSection.ontology, CreativeWork.ontology, `@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}