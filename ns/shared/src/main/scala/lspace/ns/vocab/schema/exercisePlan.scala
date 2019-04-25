package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object exercisePlan
    extends PropertyDef(
      iri = "http://schema.org/exercisePlan",
      iris = Set("http://schema.org/exercisePlan"),
      label = "exercisePlan",
      comment = """A sub property of instrument. The exercise plan used on this action.""",
      `@extends` = () => List(instrument.property),
      `@range` = () => List(ExercisePlan.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties extends lspace.ns.vocab.schema.instrument.Properties
}
