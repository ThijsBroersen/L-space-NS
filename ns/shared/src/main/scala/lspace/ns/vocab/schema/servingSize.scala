package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object servingSize
    extends PropertyDef(
      iri = "http://schema.org/servingSize",
      iris = Set("http://schema.org/servingSize"),
      label = "servingSize",
      comment = """The serving size, in terms of the number of volume or mass.""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
