package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object smokingAllowed
    extends PropertyDef(
      iri = "http://schema.org/smokingAllowed",
      iris = Set("http://schema.org/smokingAllowed"),
      label = "smokingAllowed",
      comment =
        """Indicates whether it is allowed to smoke in the place, e.g. in the restaurant, hotel or hotel room.""",
      `@extends` = () => List(),
      `@range` = () => List(`@boolean`)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
