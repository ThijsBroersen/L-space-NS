package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object healthPlanId
    extends PropertyDef(
      iri = "http://schema.org/healthPlanId",
      iris = Set("http://schema.org/healthPlanId"),
      label = "healthPlanId",
      comment =
        """The 14-character, HIOS-generated Plan ID number. (Plan IDs must be unique, even across different markets.)""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
