package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object multipleValues
    extends PropertyDef(
      iri = "http://schema.org/multipleValues",
      iris = Set("http://schema.org/multipleValues"),
      label = "multipleValues",
      comment = """Whether multiple values are allowed for the property.  Default is false.""",
      `@extends` = () => List(),
      `@range` = () => List(`@boolean`)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
