package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object usesDevice
    extends PropertyDef(
      iri = "http://schema.org/usesDevice",
      iris = Set("http://schema.org/usesDevice"),
      label = "usesDevice",
      comment = """Device used to perform the test.""",
      `@extends` = () => List(),
      `@range` = () => List(MedicalDevice.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
