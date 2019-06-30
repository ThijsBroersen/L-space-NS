package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object CafeOrCoffeeShop extends OntologyDef(
        iri = "http://schema.org/CafeOrCoffeeShop",
        iris = Set("http://schema.org/CafeOrCoffeeShop"),
        label = "CafeOrCoffeeShop",
        comment = """A cafe or coffee shop.""",
        `@extends` = () => List(FoodEstablishment.ontology)
       ){
}