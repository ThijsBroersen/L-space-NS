package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object BroadcastFrequencySpecification extends OntologyDef(
        iri = "http://schema.org/BroadcastFrequencySpecification",
        iris = Set("http://schema.org/BroadcastFrequencySpecification"),
        label = "BroadcastFrequencySpecification",
        comment = """The frequency in MHz and the modulation used for a particular BroadcastService.""",
        `@extends` = () => List(Intangible.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Intangible.Properties{
lazy val broadcastSignalModulation = lspace.ns.vocab.schema.broadcastSignalModulation.property
lazy val broadcastSubChannel = lspace.ns.vocab.schema.broadcastSubChannel.property
}
override lazy val properties: List[LProperty] = List(broadcastSignalModulation, broadcastSubChannel)
trait Properties extends lspace.ns.vocab.schema.Intangible.Properties{
lazy val broadcastSignalModulation = lspace.ns.vocab.schema.broadcastSignalModulation.property
lazy val broadcastSubChannel = lspace.ns.vocab.schema.broadcastSubChannel.property
}
}