package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object expectedPrognosis
    extends PropertyDef(
      iri = "http://schema.org/expectedPrognosis",
      iris = Set("http://schema.org/expectedPrognosis"),
      label = "expectedPrognosis",
      comment = """The likely outcome in either the short term or long term of the medical condition.""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
