package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object location
    extends PropertyDef(
      iri = "http://schema.org/location",
      iris = Set("http://schema.org/location"),
      label = "location",
      comment =
        """The location of for example where the event is happening, an organization is located, or where an action takes place.""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology, Place.ontology, PostalAddress.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
