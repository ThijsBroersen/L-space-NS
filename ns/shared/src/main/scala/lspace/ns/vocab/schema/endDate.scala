package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object endDate extends PropertyDef(
        iri = "https://schema.org/endDate",
        iris = Set("https://schema.org/endDate"),
        label = "endDate",
        comment = """The end date and time of the item (in <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 date format</a>).""",
        `@extends` = () => List(),
        `@range` = () => List(`@datetime`, `@date`)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}