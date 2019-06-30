package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object diet extends PropertyDef(
        iri = "http://schema.org/diet",
        iris = Set("http://schema.org/diet"),
        label = "diet",
        comment = """A sub property of instrument. The diet used in this action.""",
        `@extends` = () => List(instrument.property),
        `@range` = () => List(Diet.ontology)
       ){
}