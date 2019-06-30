package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object suitableForDiet extends PropertyDef(
        iri = "http://schema.org/suitableForDiet",
        iris = Set("http://schema.org/suitableForDiet"),
        label = "suitableForDiet",
        comment = """Indicates a dietary restriction or guideline for which this recipe or menu item is suitable, e.g. diabetic, halal etc.""",
        `@extends` = () => List(),
        `@range` = () => List(RestrictedDiet.ontology)
       ){
}