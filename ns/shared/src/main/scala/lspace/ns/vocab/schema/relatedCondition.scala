package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object relatedCondition
    extends PropertyDef(
      iri = "http://schema.org/relatedCondition",
      iris = Set("http://schema.org/relatedCondition"),
      label = "relatedCondition",
      comment = """A medical condition associated with this anatomy.""",
      `@extends` = () => List(),
      `@range` = () => List(MedicalCondition.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
