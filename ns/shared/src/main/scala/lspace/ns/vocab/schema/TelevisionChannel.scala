package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object TelevisionChannel
    extends OntologyDef(
      iri = "http://schema.org/TelevisionChannel",
      iris = Set("http://schema.org/TelevisionChannel"),
      label = "TelevisionChannel",
      comment = """A unique instance of a television BroadcastService on a CableOrSatelliteService lineup.""",
      `@extends` = () => List(BroadcastChannel.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.BroadcastChannel.Properties {}
  override lazy val properties: List[LProperty] = List()
  trait Properties extends lspace.ns.vocab.schema.BroadcastChannel.Properties {}
}
