package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object colorist
    extends PropertyDef(
      iri = "http://schema.org/colorist",
      iris = Set("http://schema.org/colorist"),
      label = "colorist",
      comment = """The individual who adds color to inked drawings.""",
      `@extends` = () => List(),
      `@range` = () => List(Person.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
