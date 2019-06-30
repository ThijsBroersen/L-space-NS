package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object IceCreamShop extends OntologyDef(
        iri = "http://schema.org/IceCreamShop",
        iris = Set("http://schema.org/IceCreamShop"),
        label = "IceCreamShop",
        comment = """An ice cream shop.""",
        `@extends` = () => List(FoodEstablishment.ontology)
       ){
}