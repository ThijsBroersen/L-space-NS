package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object codingSystem
    extends PropertyDef(
      iri = "http://schema.org/codingSystem",
      iris = Set("http://schema.org/codingSystem"),
      label = "codingSystem",
      comment = """The coding system, e.g. 'ICD-10'.""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
