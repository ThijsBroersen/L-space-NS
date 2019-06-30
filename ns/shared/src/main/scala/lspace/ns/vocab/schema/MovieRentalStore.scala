package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object MovieRentalStore extends OntologyDef(
        iri = "http://schema.org/MovieRentalStore",
        iris = Set("http://schema.org/MovieRentalStore"),
        label = "MovieRentalStore",
        comment = """A movie rental store.""",
        `@extends` = () => List(Store.ontology)
       ){
}