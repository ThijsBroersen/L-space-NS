package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object about
    extends PropertyDef(
      iri = "http://schema.org/about",
      iris = Set("http://schema.org/about"),
      label = "about",
      comment = """The subject matter of the content.""",
      `@extends` = () => List(),
      `@range` = () => List(Thing.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
