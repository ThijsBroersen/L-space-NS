package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object accessCode
    extends PropertyDef(
      iri = "http://schema.org/accessCode",
      iris = Set("http://schema.org/accessCode"),
      label = "accessCode",
      comment = """Password, PIN, or access code needed for delivery (e.g. from a locker).""",
      `@extends` = () => List(),
      `@range` = () => List(`@string`, Text.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
