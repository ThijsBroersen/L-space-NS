package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object DiagnosticProcedure extends OntologyDef(
        iri = "http://schema.org/DiagnosticProcedure",
        iris = Set("http://schema.org/DiagnosticProcedure"),
        label = "DiagnosticProcedure",
        comment = """A medical procedure intended primarily for diagnostic, as opposed to therapeutic, purposes.""",
        `@extends` = () => List(MedicalProcedure.ontology)
       ){
}