package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object inSupportOf
    extends PropertyDef(
      iri = "http://schema.org/inSupportOf",
      iris = Set("http://schema.org/inSupportOf"),
      label = "inSupportOf",
      comment = """Qualification, candidature, degree, application that Thesis supports.""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
