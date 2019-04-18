package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object replacee
    extends PropertyDef(
      iri = "http://schema.org/replacee",
      iris = Set("http://schema.org/replacee"),
      label = "replacee",
      comment = """A sub property of object. The object that is being replaced.""",
      `@extends` = () => List(`object`.property),
      `@range` = () => List(Thing.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.`object`.Properties
}
