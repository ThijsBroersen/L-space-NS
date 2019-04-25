package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object AuthorizeAction
    extends OntologyDef(
      iri = "http://schema.org/AuthorizeAction",
      iris = Set("http://schema.org/AuthorizeAction"),
      label = "AuthorizeAction",
      comment = """The act of granting permission to an object.""",
      `@extends` = () => List(AllocateAction.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.AllocateAction.Properties {
    lazy val recipient = lspace.ns.vocab.schema.recipient.property
  }
  override lazy val properties: List[LProperty] = List(recipient)
  trait Properties extends lspace.ns.vocab.schema.AllocateAction.Properties {
    lazy val recipient = lspace.ns.vocab.schema.recipient.property
  }
}
