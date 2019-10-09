package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object sameAs extends PropertyDef(
        iri = "http://schema.org/sameAs",
        iris = Set("http://schema.org/sameAs"),
        label = "sameAs",
        comment = """URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Wikidata entry, or official website.""",
        `@extends` = List(),
        `@range` = List(URL.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}