package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object maps
    extends PropertyDef(
      iri = "http://schema.org/maps",
      iris = Set("http://schema.org/maps"),
      label = "maps",
      comment = """A URL to a map of the place.""",
      `@extends` = () => List(),
      `@range` = () => List(URL.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
