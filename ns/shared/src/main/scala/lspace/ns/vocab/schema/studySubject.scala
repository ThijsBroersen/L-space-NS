package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object studySubject
    extends PropertyDef(
      iri = "http://schema.org/studySubject",
      iris = Set("http://schema.org/studySubject"),
      label = "studySubject",
      comment =
        """A subject of the study, i.e. one of the medical conditions, therapies, devices, drugs, etc. investigated by the study.""",
      `@extends` = () => List(),
      `@range` = () => List(MedicalEntity.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
