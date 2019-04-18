package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object broadcastServiceTier extends PropertyDef(
        iri = "http://schema.org/broadcastServiceTier",
        iris = Set("http://schema.org/broadcastServiceTier"),
        label = "broadcastServiceTier",
        comment = """The type of service required to have access to the channel (e.g. Standard or Premium).""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}