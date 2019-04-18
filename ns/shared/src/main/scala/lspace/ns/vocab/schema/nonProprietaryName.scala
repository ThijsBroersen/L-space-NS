package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object nonProprietaryName
    extends PropertyDef(
      iri = "http://schema.org/nonProprietaryName",
      iris = Set("http://schema.org/nonProprietaryName"),
      label = "nonProprietaryName",
      comment = """The generic name of this drug or supplement.""",
      `@extends` = () => List(),
      `@range` = () => List(`@string`, Text.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
