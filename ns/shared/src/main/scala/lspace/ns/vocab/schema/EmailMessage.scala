package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object EmailMessage
    extends OntologyDef(
      iri = "http://schema.org/EmailMessage",
      iris = Set("http://schema.org/EmailMessage"),
      label = "EmailMessage",
      comment = """An email message.""",
      `@extends` = () => List(Message.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Message.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.Message.Properties {}
}
