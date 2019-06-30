package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object DiagnosticLab extends OntologyDef(
        iri = "http://schema.org/DiagnosticLab",
        iris = Set("http://schema.org/DiagnosticLab"),
        label = "DiagnosticLab",
        comment = """A medical laboratory that offers on-site or off-site diagnostic services.""",
        `@extends` = () => List(MedicalOrganization.ontology)
       ){
}