package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object FoodService extends OntologyDef(
        iri = "http://schema.org/FoodService",
        iris = Set("http://schema.org/FoodService"),
        label = "FoodService",
        comment = """A food service, like breakfast, lunch, or dinner.""",
        `@extends` = () => List(Service.ontology)
       ){
}