package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Painting extends OntologyDef(
        iri = "http://schema.org/Painting",
        iris = Set("http://schema.org/Painting"),
        label = "Painting",
        comment = """A painting.""",
        `@extends` = () => List(CreativeWork.ontology)
       ){
}