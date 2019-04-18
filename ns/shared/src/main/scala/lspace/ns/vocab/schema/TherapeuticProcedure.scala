package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object TherapeuticProcedure
    extends OntologyDef(
      iri = "http://schema.org/TherapeuticProcedure",
      iris = Set("http://schema.org/TherapeuticProcedure"),
      label = "TherapeuticProcedure",
      comment =
        """A medical procedure intended primarily for therapeutic purposes, aimed at improving a health condition.""",
      `@extends` = () => List(MedicalProcedure.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.MedicalProcedure.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.MedicalProcedure.Properties {}
}
