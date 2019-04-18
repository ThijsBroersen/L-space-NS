package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object signDetected
    extends PropertyDef(
      iri = "http://schema.org/signDetected",
      iris = Set("http://schema.org/signDetected"),
      label = "signDetected",
      comment = """A sign detected by the test.""",
      `@extends` = () => List(),
      `@range` = () => List(MedicalSign.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
