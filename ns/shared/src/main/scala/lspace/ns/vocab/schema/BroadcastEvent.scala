package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object BroadcastEvent extends OntologyDef(
        iri = "http://schema.org/BroadcastEvent",
        iris = Set("http://schema.org/BroadcastEvent"),
        label = "BroadcastEvent",
        comment = """An over the air or online broadcast event.""",
        `@extends` = () => List(PublicationEvent.ontology)
       ){
object keys extends lspace.ns.vocab.schema.PublicationEvent.Properties{
lazy val broadcastOfEvent = lspace.ns.vocab.schema.broadcastOfEvent.property
lazy val isLiveBroadcast = lspace.ns.vocab.schema.isLiveBroadcast.property
lazy val videoFormat = lspace.ns.vocab.schema.videoFormat.property
override lazy val isAccessibleForFree = lspace.ns.vocab.schema.isAccessibleForFree.property}
override lazy val properties: List[LProperty] = List(broadcastOfEvent, isLiveBroadcast, videoFormat)
trait Properties extends lspace.ns.vocab.schema.PublicationEvent.Properties{
lazy val broadcastOfEvent = lspace.ns.vocab.schema.broadcastOfEvent.property
lazy val isLiveBroadcast = lspace.ns.vocab.schema.isLiveBroadcast.property
lazy val videoFormat = lspace.ns.vocab.schema.videoFormat.property
override lazy val isAccessibleForFree = lspace.ns.vocab.schema.isAccessibleForFree.property}
}