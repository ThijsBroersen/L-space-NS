package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object steps extends PropertyDef(
        iri = "http://schema.org/steps",
        iris = Set("http://schema.org/steps"),
        label = "steps",
        comment = """A single step item (as HowToStep, text, document, video, etc.) or a HowToSection (originally misnamed 'steps'; 'step' is preferred).""",
        `@extends` = () => List(),
        `@range` = () => List(CreativeWork.ontology, Text.ontology, ItemList.ontology)
       ){
}