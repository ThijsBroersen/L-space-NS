package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object causeOf
    extends PropertyDef(
      iri = "http://schema.org/causeOf",
      iris = Set("http://schema.org/causeOf"),
      label = "causeOf",
      comment = """The condition, complication, symptom, sign, etc. caused.""",
      `@extends` = () => List(),
      `@range` = () => List(MedicalEntity.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
