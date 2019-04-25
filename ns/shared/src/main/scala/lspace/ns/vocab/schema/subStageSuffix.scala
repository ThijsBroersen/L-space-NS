package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object subStageSuffix
    extends PropertyDef(
      iri = "http://schema.org/subStageSuffix",
      iris = Set("http://schema.org/subStageSuffix"),
      label = "subStageSuffix",
      comment = """The substage, e.g. 'a' for Stage IIIa.""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
