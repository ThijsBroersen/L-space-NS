package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object inventoryLevel extends PropertyDef(
        iri = "http://schema.org/inventoryLevel",
        iris = Set("http://schema.org/inventoryLevel"),
        label = "inventoryLevel",
        comment = """The current approximate inventory level for the item or items.""",
        `@extends` = () => List(),
        `@range` = () => List(QuantitativeValue.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}