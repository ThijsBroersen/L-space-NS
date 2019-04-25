package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object course
    extends PropertyDef(
      iri = "http://schema.org/course",
      iris = Set("http://schema.org/course"),
      label = "course",
      comment = """A sub property of location. The course where this action was taken.""",
      `@extends` = () => List(location.property),
      `@range` = () => List(Place.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties extends lspace.ns.vocab.schema.location.Properties
}
