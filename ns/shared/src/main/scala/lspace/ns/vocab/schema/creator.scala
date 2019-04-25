package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object creator
    extends PropertyDef(
      iri = "http://schema.org/creator",
      iris = Set("http://schema.org/creator"),
      label = "creator",
      comment = """The creator/author of this CreativeWork. This is the same as the Author property for CreativeWork.""",
      `@extends` = () => List(),
      `@range` = () => List(Organization.ontology, Person.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
