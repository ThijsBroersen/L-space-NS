package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object BroadcastChannel extends OntologyDef(
        iri = "http://schema.org/BroadcastChannel",
        iris = Set("http://schema.org/BroadcastChannel"),
        label = "BroadcastChannel",
        comment = """A unique instance of a BroadcastService on a CableOrSatelliteService lineup.""",
        `@extends` = () => List(Intangible.ontology)
       ){
}