package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object LegalForceStatus extends OntologyDef(
        iri = "http://schema.org/LegalForceStatus",
        iris = Set("http://schema.org/LegalForceStatus"),
        label = "LegalForceStatus",
        comment = """A list of possible statuses for the legal force of a legislation.""",
        `@extends` = () => List(Enumeration.ontology)
       ){
}