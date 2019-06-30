package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object query extends PropertyDef(
        iri = "http://schema.org/query",
        iris = Set("http://schema.org/query"),
        label = "query",
        comment = """A sub property of instrument. The query used on this action.""",
        `@extends` = () => List(instrument.property),
        `@range` = () => List(Text.ontology)
       ){
}