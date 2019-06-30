package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object duns extends PropertyDef(
        iri = "http://schema.org/duns",
        iris = Set("http://schema.org/duns"),
        label = "duns",
        comment = """The Dun &amp; Bradstreet DUNS number for identifying an organization or business person.""",
        `@extends` = () => List(identifier.property),
        `@range` = () => List(Text.ontology)
       ){
}