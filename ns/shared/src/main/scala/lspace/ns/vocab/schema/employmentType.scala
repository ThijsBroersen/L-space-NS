package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object employmentType
    extends PropertyDef(
      iri = "http://schema.org/employmentType",
      iris = Set("http://schema.org/employmentType"),
      label = "employmentType",
      comment = """Type of employment (e.g. full-time, part-time, contract, temporary, seasonal, internship).""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
