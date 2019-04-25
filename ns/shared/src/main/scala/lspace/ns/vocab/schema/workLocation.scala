package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object workLocation
    extends PropertyDef(
      iri = "http://schema.org/workLocation",
      iris = Set("http://schema.org/workLocation"),
      label = "workLocation",
      comment = """A contact location for a person's place of work.""",
      `@extends` = () => List(location.property),
      `@range` = () => List(ContactPoint.ontology, Place.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties extends lspace.ns.vocab.schema.location.Properties
}
