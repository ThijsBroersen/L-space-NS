package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object endorsee
    extends PropertyDef(
      iri = "http://schema.org/endorsee",
      iris = Set("http://schema.org/endorsee"),
      label = "endorsee",
      comment = """A sub property of participant. The person/organization being supported.""",
      `@extends` = () => List(participant.property),
      `@range` = () => List(Organization.ontology, Person.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties extends lspace.ns.vocab.schema.participant.Properties
}
