package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object replacer
    extends PropertyDef(
      iri = "http://schema.org/replacer",
      iris = Set("http://schema.org/replacer"),
      label = "replacer",
      comment = """A sub property of object. The object that replaces.""",
      `@extends` = () => List(`object`.property),
      `@range` = () => List(Thing.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties extends lspace.ns.vocab.schema.`object`.Properties
}
