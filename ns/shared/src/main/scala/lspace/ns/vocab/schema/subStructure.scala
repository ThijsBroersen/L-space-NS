package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object subStructure
    extends PropertyDef(
      iri = "http://schema.org/subStructure",
      iris = Set("http://schema.org/subStructure"),
      label = "subStructure",
      comment = """Component (sub-)structure(s) that comprise this anatomical structure.""",
      `@extends` = () => List(),
      `@range` = () => List(AnatomicalStructure.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
