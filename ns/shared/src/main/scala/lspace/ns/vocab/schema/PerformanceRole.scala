package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object PerformanceRole extends OntologyDef(
        iri = "http://schema.org/PerformanceRole",
        iris = Set("http://schema.org/PerformanceRole"),
        label = "PerformanceRole",
        comment = """A PerformanceRole is a Role that some entity places with regard to a theatrical performance, e.g. in a Movie, TVSeries etc.""",
        `@extends` = () => List(Role.ontology)
       ){
}