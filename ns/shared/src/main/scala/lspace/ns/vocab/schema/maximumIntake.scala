package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object maximumIntake
    extends PropertyDef(
      iri = "http://schema.org/maximumIntake",
      iris = Set("http://schema.org/maximumIntake"),
      label = "maximumIntake",
      comment =
        """Recommended intake of this supplement for a given population as defined by a specific recommending authority.""",
      `@extends` = () => List(),
      `@range` = () => List(MaximumDoseSchedule.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
