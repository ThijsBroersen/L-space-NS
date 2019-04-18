package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object representativeOfPage
    extends PropertyDef(
      iri = "http://schema.org/representativeOfPage",
      iris = Set("http://schema.org/representativeOfPage"),
      label = "representativeOfPage",
      comment = """Indicates whether this image is representative of the content of the page.""",
      `@extends` = () => List(),
      `@range` = () => List(`@boolean`)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
