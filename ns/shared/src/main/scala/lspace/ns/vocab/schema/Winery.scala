package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Winery extends OntologyDef(
        iri = "http://schema.org/Winery",
        iris = Set("http://schema.org/Winery"),
        label = "Winery",
        comment = """A winery.""",
        `@extends` = () => List(FoodEstablishment.ontology)
       ){
}