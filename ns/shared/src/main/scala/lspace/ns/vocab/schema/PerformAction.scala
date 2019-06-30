package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object PerformAction extends OntologyDef(
        iri = "http://schema.org/PerformAction",
        iris = Set("http://schema.org/PerformAction"),
        label = "PerformAction",
        comment = """The act of participating in performance arts.""",
        `@extends` = () => List(PlayAction.ontology)
       ){
}