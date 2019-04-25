package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object algorithm
    extends PropertyDef(
      iri = "http://schema.org/algorithm",
      iris = Set("http://schema.org/algorithm"),
      label = "algorithm",
      comment = """The algorithm or rules to follow to compute the score.""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
