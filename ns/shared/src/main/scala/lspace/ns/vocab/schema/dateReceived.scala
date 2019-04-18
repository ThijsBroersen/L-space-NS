package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object dateReceived
    extends PropertyDef(
      iri = "http://schema.org/dateReceived",
      iris = Set("http://schema.org/dateReceived"),
      label = "dateReceived",
      comment = """The date/time the message was received if a single recipient exists.""",
      `@extends` = () => List(),
      `@range` = () => List(`@datetime`)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
