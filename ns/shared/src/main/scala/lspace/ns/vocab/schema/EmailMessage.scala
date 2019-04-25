package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object EmailMessage
    extends OntologyDef(
      iri = "http://schema.org/EmailMessage",
      iris = Set("http://schema.org/EmailMessage"),
      label = "EmailMessage",
      comment = """An email message.""",
      `@extends` = () => List(Message.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Message.Properties {}
  override lazy val properties: List[LProperty] = List()
  trait Properties extends lspace.ns.vocab.schema.Message.Properties {}
}
