package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object startDate extends PropertyDef(
        iri = "http://schema.org/startDate",
        iris = Set("http://schema.org/startDate"),
        label = "startDate",
        comment = """The start date and time of the item (in <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 date format</a>).""",
        `@extends` = () => List(),
        `@range` = () => List(`@datetime`, `@date`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}