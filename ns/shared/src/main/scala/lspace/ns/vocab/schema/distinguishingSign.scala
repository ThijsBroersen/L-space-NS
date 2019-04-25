package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object distinguishingSign
    extends PropertyDef(
      iri = "http://schema.org/distinguishingSign",
      iris = Set("http://schema.org/distinguishingSign"),
      label = "distinguishingSign",
      comment =
        """One of a set of signs and symptoms that can be used to distinguish this diagnosis from others in the differential diagnosis.""",
      `@extends` = () => List(),
      `@range` = () => List(MedicalSignOrSymptom.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
