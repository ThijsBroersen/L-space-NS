package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object sameAs extends PropertyDef(
        iri = "@ids",
        iris = Set("@ids", "https://schema.org/sameAs"),
        label = "sameAs",
        comment = """URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Wikidata entry, or official website.""",
        `@extends` = () => List(),
        `@range` = () => List(`@string`, `@url`)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}