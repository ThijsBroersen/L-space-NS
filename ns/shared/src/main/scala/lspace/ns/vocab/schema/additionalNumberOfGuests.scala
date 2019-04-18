package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object additionalNumberOfGuests
    extends PropertyDef(
      iri = "http://schema.org/additionalNumberOfGuests",
      iris = Set("http://schema.org/additionalNumberOfGuests"),
      label = "additionalNumberOfGuests",
      comment = """If responding yes, the number of guests who will attend in addition to the invitee.""",
      `@extends` = () => List(),
      `@range` = () => List(Number.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
