package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Restaurant extends OntologyDef(
        iri = "http://schema.org/Restaurant",
        iris = Set("http://schema.org/Restaurant"),
        label = "Restaurant",
        comment = """A restaurant.""",
        `@extends` = () => List(FoodEstablishment.ontology)
       ){
}