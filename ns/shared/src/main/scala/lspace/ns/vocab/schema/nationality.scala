package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object nationality
    extends PropertyDef(
      iri = "http://schema.org/nationality",
      iris = Set("http://schema.org/nationality"),
      label = "nationality",
      comment = """Nationality of the person.""",
      `@extends` = () => List(),
      `@range` = () => List(Country.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
