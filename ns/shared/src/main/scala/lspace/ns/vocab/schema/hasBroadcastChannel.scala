package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object hasBroadcastChannel extends PropertyDef(
        iri = "http://schema.org/hasBroadcastChannel",
        iris = Set("http://schema.org/hasBroadcastChannel"),
        label = "hasBroadcastChannel",
        comment = """A broadcast channel of a broadcast service.""",
        `@extends` = () => List(),
        `@range` = () => List(BroadcastChannel.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}