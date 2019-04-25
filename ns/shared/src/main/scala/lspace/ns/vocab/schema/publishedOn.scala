package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object publishedOn
    extends PropertyDef(
      iri = "http://schema.org/publishedOn",
      iris = Set("http://schema.org/publishedOn"),
      label = "publishedOn",
      comment = """A broadcast service associated with the publication event.""",
      `@extends` = () => List(),
      `@range` = () => List(BroadcastService.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
