package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Blog extends OntologyDef(
        iri = "http://schema.org/Blog",
        iris = Set("http://schema.org/Blog"),
        label = "Blog",
        comment = """A blog.""",
        `@extends` = () => List(CreativeWork.ontology)
       ){
}