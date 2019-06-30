package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ContactPoint extends OntologyDef(
        iri = "http://schema.org/ContactPoint",
        iris = Set("http://schema.org/ContactPoint"),
        label = "ContactPoint",
        comment = """A contact point&#x2014;for example, a Customer Complaints department.""",
        `@extends` = () => List(StructuredValue.ontology)
       ){
}