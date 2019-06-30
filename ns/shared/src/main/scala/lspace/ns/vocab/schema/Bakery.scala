package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Bakery extends OntologyDef(
        iri = "http://schema.org/Bakery",
        iris = Set("http://schema.org/Bakery"),
        label = "Bakery",
        comment = """A bakery.""",
        `@extends` = () => List(FoodEstablishment.ontology)
       ){
}