package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object productionDate extends PropertyDef(
        iri = "http://schema.org/productionDate",
        iris = Set("http://schema.org/productionDate"),
        label = "productionDate",
        comment = """The date of production of the item, e.g. vehicle.""",
        `@extends` = () => List(),
        `@range` = () => List(`@date`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}