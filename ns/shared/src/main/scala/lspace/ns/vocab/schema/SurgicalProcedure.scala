package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object SurgicalProcedure
    extends OntologyDef(
      iri = "http://schema.org/SurgicalProcedure",
      iris = Set("http://schema.org/SurgicalProcedure"),
      label = "SurgicalProcedure",
      comment =
        """A medical procedure involving an incision with instruments; performed for diagnose, or therapeutic purposes.""",
      `@extends` = () => List(MedicalProcedure.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.MedicalProcedure.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.MedicalProcedure.Properties {}
}
