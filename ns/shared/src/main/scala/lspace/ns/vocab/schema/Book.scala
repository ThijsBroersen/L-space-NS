package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Book extends OntologyDef(
        iri = "http://schema.org/Book",
        iris = Set("http://schema.org/Book"),
        label = "Book",
        comment = """A book.""",
        `@extends` = () => List(CreativeWork.ontology)
       ){
}