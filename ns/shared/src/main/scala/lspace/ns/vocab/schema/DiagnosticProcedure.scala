package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object DiagnosticProcedure
    extends OntologyDef(
      iri = "http://schema.org/DiagnosticProcedure",
      iris = Set("http://schema.org/DiagnosticProcedure"),
      label = "DiagnosticProcedure",
      comment = """A medical procedure intended primarily for diagnostic, as opposed to therapeutic, purposes.""",
      `@extends` = () => List(MedicalProcedure.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.MedicalProcedure.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.MedicalProcedure.Properties {}
}
