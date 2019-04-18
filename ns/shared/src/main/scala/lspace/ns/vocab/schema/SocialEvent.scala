package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object SocialEvent
    extends OntologyDef(
      iri = "http://schema.org/SocialEvent",
      iris = Set("http://schema.org/SocialEvent"),
      label = "SocialEvent",
      comment = """Event type: Social event.""",
      `@extends` = () => List(Event.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Event.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.Event.Properties {}
}
