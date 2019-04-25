package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object stage
    extends PropertyDef(
      iri = "http://schema.org/stage",
      iris = Set("http://schema.org/stage"),
      label = "stage",
      comment = """The stage of the condition, if applicable.""",
      `@extends` = () => List(),
      `@range` = () => List(MedicalConditionStage.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
