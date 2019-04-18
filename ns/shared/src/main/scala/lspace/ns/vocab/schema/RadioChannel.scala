package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object RadioChannel
    extends OntologyDef(
      iri = "http://schema.org/RadioChannel",
      iris = Set("http://schema.org/RadioChannel"),
      label = "RadioChannel",
      comment = """A unique instance of a radio BroadcastService on a CableOrSatelliteService lineup.""",
      `@extends` = () => List(BroadcastChannel.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.BroadcastChannel.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.BroadcastChannel.Properties {}
}
