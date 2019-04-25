package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object releaseOf
    extends PropertyDef(
      iri = "http://schema.org/releaseOf",
      iris = Set("http://schema.org/releaseOf"),
      label = "releaseOf",
      comment = """The album this is a release of.""",
      `@extends` = () => List(),
      `@range` = () => List()
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
