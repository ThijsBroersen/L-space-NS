package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object PerformingGroup extends OntologyDef(
        iri = "http://schema.org/PerformingGroup",
        iris = Set("http://schema.org/PerformingGroup"),
        label = "PerformingGroup",
        comment = """A performance group, such as a band, an orchestra, or a circus.""",
        `@extends` = () => List(Organization.ontology)
       ){
}