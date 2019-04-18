package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object PublicationEvent
    extends OntologyDef(
      iri = "http://schema.org/PublicationEvent",
      iris = Set("http://schema.org/PublicationEvent"),
      label = "PublicationEvent",
      comment =
        """A PublicationEvent corresponds indifferently to the event of publication for a CreativeWork of any type e.g. a broadcast event, an on-demand event, a book/journal publication via a variety of delivery media.""",
      `@extends` = () => List(Event.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Event.Properties {
    lazy val publishedBy = lspace.ns.vocab.schema.publishedBy.property
    lazy val free        = lspace.ns.vocab.schema.free.property
    lazy val publishedOn = lspace.ns.vocab.schema.publishedOn.property
  }
  override lazy val properties: List[Property] = List(publishedBy, free, publishedOn)
  trait Properties extends lspace.ns.vocab.schema.Event.Properties {
    lazy val publishedBy = lspace.ns.vocab.schema.publishedBy.property
    lazy val free        = lspace.ns.vocab.schema.free.property
    lazy val publishedOn = lspace.ns.vocab.schema.publishedOn.property
  }
}
