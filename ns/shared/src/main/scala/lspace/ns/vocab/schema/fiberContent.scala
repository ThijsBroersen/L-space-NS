package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object fiberContent
    extends PropertyDef(
      iri = "http://schema.org/fiberContent",
      iris = Set("http://schema.org/fiberContent"),
      label = "fiberContent",
      comment = """The number of grams of fiber.""",
      `@extends` = () => List(),
      `@range` = () => List(Mass.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
