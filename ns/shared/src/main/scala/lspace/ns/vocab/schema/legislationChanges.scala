package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object legislationChanges extends PropertyDef(
        iri = "http://schema.org/legislationChanges",
        iris = Set("http://schema.org/legislationChanges"),
        label = "legislationChanges",
        comment = """Another legislation that this legislation changes. This encompasses the notions of amendment, replacement, correction, repeal, or other types of change. This may be a direct change (textual or non-textual amendment) or a consequential or indirect change. The property is to be used to express the existence of a change relationship between two acts rather than the existence of a consolidated version of the text that shows the result of the change. For consolidation relationships, use the <a href="/legislationConsolidates">legislationConsolidates</a> property.""",
        `@extends` = List(),
        `@range` = List(Legislation.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}