package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object slogan extends PropertyDef(
        iri = "http://schema.org/slogan",
        iris = Set("http://schema.org/slogan"),
        label = "slogan",
        comment = """A slogan or motto associated with the item.""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology)
       ){
}