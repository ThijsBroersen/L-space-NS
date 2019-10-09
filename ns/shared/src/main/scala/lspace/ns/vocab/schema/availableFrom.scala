package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object availableFrom extends PropertyDef(
        iri = "http://schema.org/availableFrom",
        iris = Set("http://schema.org/availableFrom"),
        label = "availableFrom",
        comment = """When the item is available for pickup from the store, locker, etc.""",
        `@extends` = List(),
        `@range` = List(`@datetime`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}