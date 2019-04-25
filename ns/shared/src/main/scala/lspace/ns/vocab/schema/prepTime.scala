package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object prepTime
    extends PropertyDef(
      iri = "http://schema.org/prepTime",
      iris = Set("http://schema.org/prepTime"),
      label = "prepTime",
      comment =
        """The length of time it takes to prepare the items to be used in instructions or a direction, in <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 duration format</a>.""",
      `@extends` = () => List(),
      `@range` = () => List(Duration.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
