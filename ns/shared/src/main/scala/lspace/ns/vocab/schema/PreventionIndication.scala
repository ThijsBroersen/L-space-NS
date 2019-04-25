package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object PreventionIndication
    extends OntologyDef(
      iri = "http://schema.org/PreventionIndication",
      iris = Set("http://schema.org/PreventionIndication"),
      label = "PreventionIndication",
      comment = """An indication for preventing an underlying condition, symptom, etc.""",
      `@extends` = () => List(MedicalIndication.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.MedicalIndication.Properties {}
  override lazy val properties: List[LProperty] = List()
  trait Properties extends lspace.ns.vocab.schema.MedicalIndication.Properties {}
}
