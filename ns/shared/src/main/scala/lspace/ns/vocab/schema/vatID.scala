package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object vatID
    extends PropertyDef(
      iri = "http://schema.org/vatID",
      iris = Set("http://schema.org/vatID"),
      label = "vatID",
      comment = """The Value-added Tax ID of the organization or person.""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
