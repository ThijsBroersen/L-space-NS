package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object FoodEstablishment extends OntologyDef(
        iri = "http://schema.org/FoodEstablishment",
        iris = Set("http://schema.org/FoodEstablishment"),
        label = "FoodEstablishment",
        comment = """A food-related business.""",
        `@extends` = () => List(LocalBusiness.ontology)
       ){
}