package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object interactionCount extends PropertyDef(
        iri = "http://schema.org/interactionCount",
        iris = Set("http://schema.org/interactionCount"),
        label = "interactionCount",
        comment = """This property is deprecated, alongside the UserInteraction types on which it depended.""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){
}