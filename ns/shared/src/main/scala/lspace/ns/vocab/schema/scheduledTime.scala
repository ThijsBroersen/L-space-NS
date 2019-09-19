package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object scheduledTime extends PropertyDef(
        iri = "http://schema.org/scheduledTime",
        iris = Set("http://schema.org/scheduledTime"),
        label = "scheduledTime",
        comment = """The time the object is scheduled to.""",
        `@extends` = () => List(),
        `@range` = () => List(`@datetime`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}