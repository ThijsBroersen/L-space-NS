package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object email
    extends PropertyDef(
      iri = "http://schema.org/email",
      iris = Set("http://schema.org/email"),
      label = "email",
      comment = """Email address.""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
