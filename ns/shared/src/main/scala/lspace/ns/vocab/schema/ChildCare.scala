package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ChildCare extends OntologyDef(
        iri = "http://schema.org/ChildCare",
        iris = Set("http://schema.org/ChildCare"),
        label = "ChildCare",
        comment = """A Childcare center.""",
        `@extends` = () => List(LocalBusiness.ontology)
       ){
}