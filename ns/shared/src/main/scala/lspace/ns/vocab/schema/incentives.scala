package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object incentives
    extends PropertyDef(
      iri = "http://schema.org/incentives",
      iris = Set("http://schema.org/incentives"),
      label = "incentives",
      comment = """Description of bonus and commission compensation aspects of the job.""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
