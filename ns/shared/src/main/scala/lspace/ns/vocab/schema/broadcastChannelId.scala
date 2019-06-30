package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object broadcastChannelId extends PropertyDef(
        iri = "http://schema.org/broadcastChannelId",
        iris = Set("http://schema.org/broadcastChannelId"),
        label = "broadcastChannelId",
        comment = """The unique address by which the BroadcastService can be identified in a provider lineup. In US, this is typically a number.""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology)
       ){
}