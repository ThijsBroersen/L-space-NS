package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object borrower
    extends PropertyDef(
      iri = "http://schema.org/borrower",
      iris = Set("http://schema.org/borrower"),
      label = "borrower",
      comment = """A sub property of participant. The person that borrows the object being lent.""",
      `@extends` = () => List(participant.property),
      `@range` = () => List(Person.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.participant.Properties
}
