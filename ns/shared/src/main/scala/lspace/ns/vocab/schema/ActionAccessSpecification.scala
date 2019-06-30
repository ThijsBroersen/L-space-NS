package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ActionAccessSpecification extends OntologyDef(
        iri = "http://schema.org/ActionAccessSpecification",
        iris = Set("http://schema.org/ActionAccessSpecification"),
        label = "ActionAccessSpecification",
        comment = """A set of requirements that a must be fulfilled in order to perform an Action.""",
        `@extends` = () => List(Intangible.ontology)
       ){
}