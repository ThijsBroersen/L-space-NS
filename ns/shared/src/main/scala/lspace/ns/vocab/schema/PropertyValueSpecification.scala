package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object PropertyValueSpecification extends OntologyDef(
        iri = "http://schema.org/PropertyValueSpecification",
        iris = Set("http://schema.org/PropertyValueSpecification"),
        label = "PropertyValueSpecification",
        comment = """A Property value specification.""",
        `@extends` = () => List(Intangible.ontology)
       ){
}