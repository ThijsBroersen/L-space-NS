package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object dateIssued
    extends PropertyDef(
      iri = "http://schema.org/dateIssued",
      iris = Set("http://schema.org/dateIssued"),
      label = "dateIssued",
      comment = """The date the ticket was issued.""",
      `@extends` = () => List(),
      `@range` = () => List(`@datetime`)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
