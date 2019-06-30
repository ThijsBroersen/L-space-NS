package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Review extends OntologyDef(
        iri = "http://schema.org/Review",
        iris = Set("http://schema.org/Review"),
        label = "Review",
        comment = """A review of an item - for example, of a restaurant, movie, or store.""",
        `@extends` = () => List(CreativeWork.ontology)
       ){
}