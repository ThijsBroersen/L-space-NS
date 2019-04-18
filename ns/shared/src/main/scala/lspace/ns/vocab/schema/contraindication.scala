package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object contraindication
    extends PropertyDef(
      iri = "http://schema.org/contraindication",
      iris = Set("http://schema.org/contraindication"),
      label = "contraindication",
      comment = """A contraindication for this therapy.""",
      `@extends` = () => List(),
      `@range` = () => List(`@string`, Text.ontology, MedicalContraindication.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
