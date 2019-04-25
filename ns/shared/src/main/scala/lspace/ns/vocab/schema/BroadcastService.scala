package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object BroadcastService
    extends OntologyDef(
      iri = "http://schema.org/BroadcastService",
      iris = Set("http://schema.org/BroadcastService"),
      label = "BroadcastService",
      comment = """A delivery service through which content is provided via broadcast over the air or online.""",
      `@extends` = () => List(Service.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Service.Properties {
    lazy val broadcaster = lspace.ns.vocab.schema.broadcaster.property
  }
  override lazy val properties: List[LProperty] = List(broadcaster)
  trait Properties extends lspace.ns.vocab.schema.Service.Properties {
    lazy val broadcaster = lspace.ns.vocab.schema.broadcaster.property
  }
}
