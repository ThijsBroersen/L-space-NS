package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object specialty
    extends PropertyDef(
      iri = "http://schema.org/specialty",
      iris = Set("http://schema.org/specialty"),
      label = "specialty",
      comment = """One of the domain specialities to which this web page's content applies.""",
      `@extends` = () => List(),
      `@range` = () => List(Specialty.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
