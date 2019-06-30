package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object BookStore extends OntologyDef(
        iri = "http://schema.org/BookStore",
        iris = Set("http://schema.org/BookStore"),
        label = "BookStore",
        comment = """A bookstore.""",
        `@extends` = () => List(Store.ontology)
       ){
}