package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object title
    extends PropertyDef(
      iri = "http://schema.org/title",
      iris = Set("http://schema.org/title"),
      label = "title",
      comment = """The title of the job.""",
      `@extends` = () => List(),
      `@range` = () => List(`@string`)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
