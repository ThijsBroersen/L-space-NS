package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object item extends PropertyDef(
        iri = "http://schema.org/item",
        iris = Set("http://schema.org/item"),
        label = "item",
        comment = """An entity represented by an entry in a list or data feed (e.g. an 'artist' in a list of 'artists')’.""",
        `@extends` = () => List(),
        `@range` = () => List(Thing.ontology)
       ){
}