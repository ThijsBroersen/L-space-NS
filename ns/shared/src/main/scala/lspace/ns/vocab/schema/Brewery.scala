package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Brewery extends OntologyDef(
        iri = "http://schema.org/Brewery",
        iris = Set("http://schema.org/Brewery"),
        label = "Brewery",
        comment = """Brewery.""",
        `@extends` = () => List(FoodEstablishment.ontology)
       ){
}