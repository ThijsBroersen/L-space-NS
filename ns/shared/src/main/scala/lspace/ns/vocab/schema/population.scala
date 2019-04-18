package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object population
    extends PropertyDef(
      iri = "http://schema.org/population",
      iris = Set("http://schema.org/population"),
      label = "population",
      comment = """Any characteristics of the population used in the study, e.g. 'males under 65'.""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
