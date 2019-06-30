package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Movie extends OntologyDef(
        iri = "http://schema.org/Movie",
        iris = Set("http://schema.org/Movie"),
        label = "Movie",
        comment = """A movie.""",
        `@extends` = () => List(CreativeWork.ontology)
       ){
}