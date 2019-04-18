package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object legislationIdentifier extends PropertyDef(
        iri = "http://schema.org/legislationIdentifier",
        iris = Set("http://schema.org/legislationIdentifier"),
        label = "legislationIdentifier",
        comment = """An identifier for the legislation. This can be either a string-based identifier, like the CELEX at EU level or the NOR in France, or a web-based, URL/URI identifier, like an ELI (European Legislation Identifier) or an URN-Lex.""",
        `@extends` = () => List(identifier.property),
        `@range` = () => List(URL.ontology, Text.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.identifier.Properties
}