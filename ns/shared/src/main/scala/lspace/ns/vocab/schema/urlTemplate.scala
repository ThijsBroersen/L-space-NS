package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object urlTemplate extends PropertyDef(
        iri = "http://schema.org/urlTemplate",
        iris = Set("http://schema.org/urlTemplate"),
        label = "urlTemplate",
        comment = """An url template (RFC6570) that will be used to construct the target of the execution of the action.""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology)
       ){
}