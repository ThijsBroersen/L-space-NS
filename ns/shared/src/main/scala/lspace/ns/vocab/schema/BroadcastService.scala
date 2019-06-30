package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object BroadcastService extends OntologyDef(
        iri = "http://schema.org/BroadcastService",
        iris = Set("http://schema.org/BroadcastService"),
        label = "BroadcastService",
        comment = """A delivery service through which content is provided via broadcast over the air or online.""",
        `@extends` = () => List(Service.ontology)
       ){
}