package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object availableThrough extends PropertyDef(
        iri = "http://schema.org/availableThrough",
        iris = Set("http://schema.org/availableThrough"),
        label = "availableThrough",
        comment = """After this date, the item will no longer be available for pickup.""",
        `@extends` = List(),
        `@range` = List(`@datetime`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}