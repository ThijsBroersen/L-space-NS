package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object recipeInstructions extends PropertyDef(
        iri = "http://schema.org/recipeInstructions",
        iris = Set("http://schema.org/recipeInstructions"),
        label = "recipeInstructions",
        comment = """A step in making the recipe, in the form of a single item (document, video, etc.) or an ordered list with HowToStep and/or HowToSection items.""",
        `@extends` = () => List(step.property),
        `@range` = () => List(CreativeWork.ontology, Text.ontology, ItemList.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.step.Properties
}