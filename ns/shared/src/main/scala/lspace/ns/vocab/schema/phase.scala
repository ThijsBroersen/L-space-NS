package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object phase
    extends PropertyDef(
      iri = "http://schema.org/phase",
      iris = Set("http://schema.org/phase"),
      label = "phase",
      comment = """The phase of the clinical trial.""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
