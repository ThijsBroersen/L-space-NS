package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object foundingDate
    extends PropertyDef(
      iri = "http://schema.org/foundingDate",
      iris = Set("http://schema.org/foundingDate"),
      label = "foundingDate",
      comment = """The date that this organization was founded.""",
      `@extends` = () => List(),
      `@range` = () => List(`@date`)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
