package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object MedicalIntangible
    extends OntologyDef(
      iri = "http://schema.org/MedicalIntangible",
      iris = Set("http://schema.org/MedicalIntangible"),
      label = "MedicalIntangible",
      comment =
        """A utility class that serves as the umbrella for a number of 'intangible' things in the medical space.""",
      `@extends` = () => List(MedicalEntity.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.MedicalEntity.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.MedicalEntity.Properties {}
}
