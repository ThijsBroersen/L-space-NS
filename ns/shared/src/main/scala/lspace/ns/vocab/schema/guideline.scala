package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object guideline
    extends PropertyDef(
      iri = "http://schema.org/guideline",
      iris = Set("http://schema.org/guideline"),
      label = "guideline",
      comment = """A medical guideline related to this entity.""",
      `@extends` = () => List(),
      `@range` = () => List(MedicalGuideline.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
