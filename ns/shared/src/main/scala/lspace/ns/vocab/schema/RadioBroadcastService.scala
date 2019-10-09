package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object RadioBroadcastService extends OntologyDef(
        iri = "http://schema.org/RadioBroadcastService",
        iris = Set("http://schema.org/RadioBroadcastService"),
        label = "RadioBroadcastService",
        comment = """A delivery service through which radio content is provided via broadcast over the air or online.""",
        `@extends` = List(BroadcastService.ontology)
       ){
object keys extends lspace.ns.vocab.schema.BroadcastService.Properties{
lazy val callSign = lspace.ns.vocab.schema.callSign.property
}
override lazy val properties: List[LProperty] = List(callSign)
trait Properties extends lspace.ns.vocab.schema.BroadcastService.Properties{
lazy val callSign = lspace.ns.vocab.schema.callSign.property
}
}