package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object studyDesign
    extends PropertyDef(
      iri = "http://schema.org/studyDesign",
      iris = Set("http://schema.org/studyDesign"),
      label = "studyDesign",
      comment = """Specifics about the observational study design (enumerated).""",
      `@extends` = () => List(),
      `@range` = () => List(MedicalObservationalStudyDesign.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
