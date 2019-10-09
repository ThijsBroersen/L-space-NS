package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object recipe extends PropertyDef(
        iri = "http://schema.org/recipe",
        iris = Set("http://schema.org/recipe"),
        label = "recipe",
        comment = """A sub property of instrument. The recipe/instructions used to perform the action.""",
        `@extends` = List(instrument.property),
        `@range` = List(Recipe.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.instrument.Properties
}