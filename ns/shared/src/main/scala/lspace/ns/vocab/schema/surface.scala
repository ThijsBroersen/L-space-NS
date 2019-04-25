package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object surface
    extends PropertyDef(
      iri = "http://schema.org/surface",
      iris = Set("http://schema.org/surface"),
      label = "surface",
      comment = """A material used as a surface in some artwork, e.g. Canvas, Paper, Wood, Board, etc.""",
      `@extends` = () => List(material.property),
      `@range` = () => List(Text.ontology, URL.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties extends lspace.ns.vocab.schema.material.Properties
}
