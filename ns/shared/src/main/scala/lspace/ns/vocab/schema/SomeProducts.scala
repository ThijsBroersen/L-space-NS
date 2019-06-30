package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object SomeProducts extends OntologyDef(
        iri = "http://schema.org/SomeProducts",
        iris = Set("http://schema.org/SomeProducts"),
        label = "SomeProducts",
        comment = """A placeholder for multiple similar products of the same kind.""",
        `@extends` = () => List(Product.ontology)
       ){
}