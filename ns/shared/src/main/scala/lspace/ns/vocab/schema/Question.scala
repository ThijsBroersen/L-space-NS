package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Question extends OntologyDef(
        iri = "http://schema.org/Question",
        iris = Set("http://schema.org/Question"),
        label = "Question",
        comment = """A specific question - e.g. from a user seeking answers online, or collected in a Frequently Asked Questions (FAQ) document.""",
        `@extends` = () => List(CreativeWork.ontology)
       ){
}