package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Plumber extends OntologyDef(
        iri = "http://schema.org/Plumber",
        iris = Set("http://schema.org/Plumber"),
        label = "Plumber",
        comment = """A plumbing service.""",
        `@extends` = () => List(HomeAndConstructionBusiness.ontology)
       ){
}