package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object securityScreening
    extends PropertyDef(
      iri = "http://schema.org/securityScreening",
      iris = Set("http://schema.org/securityScreening"),
      label = "securityScreening",
      comment = """The type of security screening the passenger is subject to.""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
