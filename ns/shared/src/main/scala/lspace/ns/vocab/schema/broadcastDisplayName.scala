package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object broadcastDisplayName extends PropertyDef(
        iri = "http://schema.org/broadcastDisplayName",
        iris = Set("http://schema.org/broadcastDisplayName"),
        label = "broadcastDisplayName",
        comment = """The name displayed in the channel guide. For many US affiliates, it is the network name.""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology)
       ){
}