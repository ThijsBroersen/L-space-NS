package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object broadcastSubChannel extends PropertyDef(
        iri = "http://schema.org/broadcastSubChannel",
        iris = Set("http://schema.org/broadcastSubChannel"),
        label = "broadcastSubChannel",
        comment = """The subchannel used for the broadcast.""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology)
       ){
}