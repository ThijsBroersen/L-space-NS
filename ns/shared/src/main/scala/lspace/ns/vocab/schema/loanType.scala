package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object loanType
    extends PropertyDef(
      iri = "http://schema.org/loanType",
      iris = Set("http://schema.org/loanType"),
      label = "loanType",
      comment = """The type of a loan or credit.""",
      `@extends` = () => List(),
      `@range` = () => List(`@string`, Text.ontology, URL.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
