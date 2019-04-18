package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object dateSent
    extends PropertyDef(
      iri = "http://schema.org/dateSent",
      iris = Set("http://schema.org/dateSent"),
      label = "dateSent",
      comment = """The date/time at which the message was sent.""",
      `@extends` = () => List(),
      `@range` = () => List(`@datetime`)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
