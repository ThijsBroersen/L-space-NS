package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object genre
    extends PropertyDef(
      iri = "http://schema.org/genre",
      iris = Set("http://schema.org/genre"),
      label = "genre",
      comment = """Genre of the creative work, broadcast channel or group.""",
      `@extends` = () => List(),
      `@range` = () => List(URL.ontology, Text.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
