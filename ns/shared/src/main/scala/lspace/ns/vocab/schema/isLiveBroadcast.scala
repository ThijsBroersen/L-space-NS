package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object isLiveBroadcast extends PropertyDef(
        iri = "http://schema.org/isLiveBroadcast",
        iris = Set("http://schema.org/isLiveBroadcast"),
        label = "isLiveBroadcast",
        comment = """True is the broadcast is of a live event.""",
        `@extends` = () => List(),
        `@range` = () => List(`@boolean`)
       ){
}