package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object evidenceLevel
    extends PropertyDef(
      iri = "http://schema.org/evidenceLevel",
      iris = Set("http://schema.org/evidenceLevel"),
      label = "evidenceLevel",
      comment = """Strength of evidence of the data used to formulate the guideline (enumerated).""",
      `@extends` = () => List(),
      `@range` = () => List(MedicalEvidenceLevel.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
