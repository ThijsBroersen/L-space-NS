package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object targetCollection
    extends PropertyDef(
      iri = "http://schema.org/targetCollection",
      iris = Set("http://schema.org/targetCollection"),
      label = "targetCollection",
      comment = """A sub property of object. The collection target of the action.""",
      `@extends` = () => List(`object`.property),
      `@range` = () => List(Thing.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.`object`.Properties
}
