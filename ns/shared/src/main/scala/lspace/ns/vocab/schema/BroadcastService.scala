package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object BroadcastService extends OntologyDef(
        iri = "http://schema.org/BroadcastService",
        iris = Set("http://schema.org/BroadcastService"),
        label = "BroadcastService",
        comment = """A delivery service through which content is provided via broadcast over the air or online.""",
        `@extends` = List(Service.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Service.Properties{
lazy val broadcastAffiliateOf = lspace.ns.vocab.schema.broadcastAffiliateOf.property
lazy val broadcastDisplayName = lspace.ns.vocab.schema.broadcastDisplayName.property
lazy val broadcastFrequency = lspace.ns.vocab.schema.broadcastFrequency.property
lazy val broadcastTimezone = lspace.ns.vocab.schema.broadcastTimezone.property
lazy val broadcaster = lspace.ns.vocab.schema.broadcaster.property
lazy val hasBroadcastChannel = lspace.ns.vocab.schema.hasBroadcastChannel.property
lazy val parentService = lspace.ns.vocab.schema.parentService.property
lazy val videoFormat = lspace.ns.vocab.schema.videoFormat.property
}
override lazy val properties: List[LProperty] = List(broadcastAffiliateOf, broadcastDisplayName, broadcastFrequency, broadcastTimezone, broadcaster, hasBroadcastChannel, parentService, videoFormat)
trait Properties extends lspace.ns.vocab.schema.Service.Properties{
lazy val broadcastAffiliateOf = lspace.ns.vocab.schema.broadcastAffiliateOf.property
lazy val broadcastDisplayName = lspace.ns.vocab.schema.broadcastDisplayName.property
lazy val broadcastFrequency = lspace.ns.vocab.schema.broadcastFrequency.property
lazy val broadcastTimezone = lspace.ns.vocab.schema.broadcastTimezone.property
lazy val broadcaster = lspace.ns.vocab.schema.broadcaster.property
lazy val hasBroadcastChannel = lspace.ns.vocab.schema.hasBroadcastChannel.property
lazy val parentService = lspace.ns.vocab.schema.parentService.property
lazy val videoFormat = lspace.ns.vocab.schema.videoFormat.property
}
}