package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object messageAttachment
    extends PropertyDef(
      iri = "http://schema.org/messageAttachment",
      iris = Set("http://schema.org/messageAttachment"),
      label = "messageAttachment",
      comment = """A CreativeWork attached to the message.""",
      `@extends` = () => List(),
      `@range` = () => List(CreativeWork.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
