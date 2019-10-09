package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object byMonthDay extends PropertyDef(
        iri = "http://schema.org/byMonthDay",
        iris = Set("http://schema.org/byMonthDay"),
        label = "byMonthDay",
        comment = """Defines the day(s) of the month on which a recurring <a class="localLink" href="http://schema.org/Event">Event</a> takes place. Specified as an <a class="localLink" href="http://schema.org/Integer">Integer</a> between 1-31.""",
        `@extends` = List(),
        `@range` = List(`@int`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}