package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object landlord
    extends PropertyDef(
      iri = "http://schema.org/landlord",
      iris = Set("http://schema.org/landlord"),
      label = "landlord",
      comment = """A sub property of participant. The owner of the real estate property.""",
      `@extends` = () => List(participant.property),
      `@range` = () => List(Person.ontology, Organization.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties extends lspace.ns.vocab.schema.participant.Properties
}
