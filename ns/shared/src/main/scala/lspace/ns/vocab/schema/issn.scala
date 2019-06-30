package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object issn extends PropertyDef(
        iri = "http://schema.org/issn",
        iris = Set("http://schema.org/issn"),
        label = "issn",
        comment = """The International Standard Serial Number (ISSN) that identifies this serial publication. You can repeat this property to identify different formats of, or the linking ISSN (ISSN-L) for, this serial publication.""",
        `@extends` = () => List(identifier.property),
        `@range` = () => List(Text.ontology)
       ){
}