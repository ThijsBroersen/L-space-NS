package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object qualifications
    extends PropertyDef(
      iri = "http://schema.org/qualifications",
      iris = Set("http://schema.org/qualifications"),
      label = "qualifications",
      comment = """Specific qualifications required for this role or Occupation.""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
