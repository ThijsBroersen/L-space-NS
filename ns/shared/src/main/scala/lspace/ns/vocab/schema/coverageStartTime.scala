package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object coverageStartTime extends PropertyDef(
        iri = "http://schema.org/coverageStartTime",
        iris = Set("http://schema.org/coverageStartTime"),
        label = "coverageStartTime",
        comment = """The time when the live blog will begin covering the Event. Note that coverage may begin before the Event's start time. The LiveBlogPosting may also be created before coverage begins.""",
        `@extends` = () => List(),
        `@range` = () => List(`@datetime`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}