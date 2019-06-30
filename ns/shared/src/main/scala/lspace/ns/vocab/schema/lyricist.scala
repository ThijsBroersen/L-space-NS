package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object lyricist extends PropertyDef(
        iri = "http://schema.org/lyricist",
        iris = Set("http://schema.org/lyricist"),
        label = "lyricist",
        comment = """The person who wrote the words.""",
        `@extends` = () => List(),
        `@range` = () => List(Person.ontology)
       ){
}