package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ToyStore extends OntologyDef(
        iri = "http://schema.org/ToyStore",
        iris = Set("http://schema.org/ToyStore"),
        label = "ToyStore",
        comment = """A toy store.""",
        `@extends` = () => List(Store.ontology)
       ){
}