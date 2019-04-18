package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object buyer
    extends PropertyDef(
      iri = "http://schema.org/buyer",
      iris = Set("http://schema.org/buyer"),
      label = "buyer",
      comment = """A sub property of participant. The participant/person/organization that bought the object.""",
      `@extends` = () => List(participant.property),
      `@range` = () => List(Person.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.participant.Properties
}
