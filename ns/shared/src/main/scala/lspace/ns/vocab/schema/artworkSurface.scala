package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object artworkSurface
    extends PropertyDef(
      iri = "http://schema.org/artworkSurface",
      iris = Set("http://schema.org/artworkSurface"),
      label = "artworkSurface",
      comment = """The supporting materials for the artwork, e.g. Canvas, Paper, Wood, Board, etc.""",
      `@extends` = () => List(),
      `@range` = () => List(URL.ontology, Text.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
