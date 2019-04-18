package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object lender
    extends PropertyDef(
      iri = "http://schema.org/lender",
      iris = Set("http://schema.org/lender"),
      label = "lender",
      comment = """A sub property of participant. The person that lends the object being borrowed.""",
      `@extends` = () => List(participant.property),
      `@range` = () => List(Organization.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.participant.Properties
}
