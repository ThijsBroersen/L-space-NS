package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Sculpture extends OntologyDef(
        iri = "http://schema.org/Sculpture",
        iris = Set("http://schema.org/Sculpture"),
        label = "Sculpture",
        comment = """A piece of sculpture.""",
        `@extends` = () => List(CreativeWork.ontology)
       ){
}