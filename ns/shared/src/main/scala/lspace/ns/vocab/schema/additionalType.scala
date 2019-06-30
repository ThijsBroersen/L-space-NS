package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object additionalType extends PropertyDef(
        iri = "http://schema.org/additionalType",
        iris = Set("http://schema.org/additionalType"),
        label = "additionalType",
        comment = """An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.""",
        `@extends` = () => List(`@type`),
        `@range` = () => List(URL.ontology)
       ){
}