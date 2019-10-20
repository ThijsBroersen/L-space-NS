package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object endDate extends PropertyDef(
        iri = "http://schema.org/endDate",
        iris = Set("http://schema.org/endDate"),
        label = "endDate",
        comment = """The end date and time of the item (in <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 date format</a>).""",
        `@extends` = List(),
        `@range` = List(`@date`, `@datetime`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}