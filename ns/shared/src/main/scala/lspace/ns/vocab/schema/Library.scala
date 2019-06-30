package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Library extends OntologyDef(
        iri = "http://schema.org/Library",
        iris = Set("http://schema.org/Library"),
        label = "Library",
        comment = """A library.""",
        `@extends` = () => List(LocalBusiness.ontology)
       ){
}