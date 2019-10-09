package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object BroadcastChannel extends OntologyDef(
        iri = "http://schema.org/BroadcastChannel",
        iris = Set("http://schema.org/BroadcastChannel"),
        label = "BroadcastChannel",
        comment = """A unique instance of a BroadcastService on a CableOrSatelliteService lineup.""",
        `@extends` = List(Intangible.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Intangible.Properties{
lazy val broadcastChannelId = lspace.ns.vocab.schema.broadcastChannelId.property
lazy val broadcastFrequency = lspace.ns.vocab.schema.broadcastFrequency.property
lazy val broadcastServiceTier = lspace.ns.vocab.schema.broadcastServiceTier.property
lazy val genre = lspace.ns.vocab.schema.genre.property
lazy val inBroadcastLineup = lspace.ns.vocab.schema.inBroadcastLineup.property
lazy val providesBroadcastService = lspace.ns.vocab.schema.providesBroadcastService.property
}
override lazy val properties: List[LProperty] = List(broadcastChannelId, broadcastFrequency, broadcastServiceTier, genre, inBroadcastLineup, providesBroadcastService)
trait Properties extends lspace.ns.vocab.schema.Intangible.Properties{
lazy val broadcastChannelId = lspace.ns.vocab.schema.broadcastChannelId.property
lazy val broadcastFrequency = lspace.ns.vocab.schema.broadcastFrequency.property
lazy val broadcastServiceTier = lspace.ns.vocab.schema.broadcastServiceTier.property
lazy val genre = lspace.ns.vocab.schema.genre.property
lazy val inBroadcastLineup = lspace.ns.vocab.schema.inBroadcastLineup.property
lazy val providesBroadcastService = lspace.ns.vocab.schema.providesBroadcastService.property
}
}