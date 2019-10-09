package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object pickupTime extends PropertyDef(
        iri = "http://schema.org/pickupTime",
        iris = Set("http://schema.org/pickupTime"),
        label = "pickupTime",
        comment = """When a taxi will pickup a passenger or a rental car can be picked up.""",
        `@extends` = List(),
        `@range` = List(`@datetime`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}