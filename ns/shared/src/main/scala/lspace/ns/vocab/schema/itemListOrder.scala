package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object itemListOrder extends PropertyDef(
        iri = "http://schema.org/itemListOrder",
        iris = Set("http://schema.org/itemListOrder"),
        label = "itemListOrder",
        comment = """Type of ordering (e.g. Ascending, Descending, Unordered).""",
        `@extends` = List(),
        `@range` = List(ItemListOrderType.ontology, `@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}