package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object activeIngredient extends PropertyDef(
        iri = "http://schema.org/activeIngredient",
        iris = Set("http://schema.org/activeIngredient"),
        label = "activeIngredient",
        comment = """An active ingredient, typically chemical compounds and/or biologic substances.""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}