package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object coverageEndTime extends PropertyDef(
        iri = "http://schema.org/coverageEndTime",
        iris = Set("http://schema.org/coverageEndTime"),
        label = "coverageEndTime",
        comment = """The time when the live blog will stop covering the Event. Note that coverage may continue after the Event concludes.""",
        `@extends` = List(),
        `@range` = List(`@datetime`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}