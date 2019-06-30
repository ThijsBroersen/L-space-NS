package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object OwnershipInfo extends OntologyDef(
        iri = "http://schema.org/OwnershipInfo",
        iris = Set("http://schema.org/OwnershipInfo"),
        label = "OwnershipInfo",
        comment = """A structured value providing information about when a certain organization or person owned a certain product.""",
        `@extends` = () => List(StructuredValue.ontology)
       ){
}