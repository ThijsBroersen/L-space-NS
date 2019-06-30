package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object FastFoodRestaurant extends OntologyDef(
        iri = "http://schema.org/FastFoodRestaurant",
        iris = Set("http://schema.org/FastFoodRestaurant"),
        label = "FastFoodRestaurant",
        comment = """A fast-food restaurant.""",
        `@extends` = () => List(FoodEstablishment.ontology)
       ){
}