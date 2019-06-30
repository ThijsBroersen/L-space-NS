package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object clipNumber extends PropertyDef(
        iri = "http://schema.org/clipNumber",
        iris = Set("http://schema.org/clipNumber"),
        label = "clipNumber",
        comment = """Position of the clip within an ordered group of clips.""",
        `@extends` = () => List(position.property),
        `@range` = () => List(`@string`, Text.ontology)
       ){
}