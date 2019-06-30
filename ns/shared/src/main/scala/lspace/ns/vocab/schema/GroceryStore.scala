package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object GroceryStore extends OntologyDef(
        iri = "http://schema.org/GroceryStore",
        iris = Set("http://schema.org/GroceryStore"),
        label = "GroceryStore",
        comment = """A grocery store.""",
        `@extends` = () => List(Store.ontology)
       ){
}