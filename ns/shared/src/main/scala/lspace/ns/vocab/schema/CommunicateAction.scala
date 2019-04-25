package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object CommunicateAction
    extends OntologyDef(
      iri = "http://schema.org/CommunicateAction",
      iris = Set("http://schema.org/CommunicateAction"),
      label = "CommunicateAction",
      comment =
        """The act of conveying information to another person via a communication medium (instrument) such as speech, email, or telephone conversation.""",
      `@extends` = () => List(InteractAction.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.InteractAction.Properties {
    lazy val language   = lspace.ns.vocab.schema.language.property
    lazy val inLanguage = lspace.ns.vocab.schema.inLanguage.property
    lazy val recipient  = lspace.ns.vocab.schema.recipient.property
  }
  override lazy val properties: List[LProperty] = List(language, inLanguage, recipient)
  trait Properties extends lspace.ns.vocab.schema.InteractAction.Properties {
    lazy val language   = lspace.ns.vocab.schema.language.property
    lazy val inLanguage = lspace.ns.vocab.schema.inLanguage.property
    lazy val recipient  = lspace.ns.vocab.schema.recipient.property
  }
}
