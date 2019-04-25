package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object activityDuration
    extends PropertyDef(
      iri = "http://schema.org/activityDuration",
      iris = Set("http://schema.org/activityDuration"),
      label = "activityDuration",
      comment = """Length of time to engage in the activity.""",
      `@extends` = () => List(),
      `@range` = () => List(QualitativeValue.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
