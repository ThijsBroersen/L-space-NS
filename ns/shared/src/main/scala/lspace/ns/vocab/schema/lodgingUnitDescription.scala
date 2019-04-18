package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object lodgingUnitDescription
    extends PropertyDef(
      iri = "http://schema.org/lodgingUnitDescription",
      iris = Set("http://schema.org/lodgingUnitDescription"),
      label = "lodgingUnitDescription",
      comment = """A full description of the lodging unit.""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
