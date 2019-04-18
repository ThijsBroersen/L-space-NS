package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object opponent
    extends PropertyDef(
      iri = "http://schema.org/opponent",
      iris = Set("http://schema.org/opponent"),
      label = "opponent",
      comment = """A sub property of participant. The opponent on this action.""",
      `@extends` = () => List(participant.property),
      `@range` = () => List(Person.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.participant.Properties
}
