package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object MedicalIndication
    extends OntologyDef(
      iri = "http://schema.org/MedicalIndication",
      iris = Set("http://schema.org/MedicalIndication"),
      label = "MedicalIndication",
      comment =
        """A condition or factor that indicates use of a medical therapy, including signs, symptoms, risk factors, anatomical states, etc.""",
      `@extends` = () => List(MedicalEntity.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.MedicalEntity.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.MedicalEntity.Properties {}
}
