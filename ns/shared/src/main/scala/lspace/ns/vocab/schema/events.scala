package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object events extends PropertyDef(
        iri = "https://schema.org/events",
        iris = Set("https://schema.org/events"),
        label = "events",
        comment = """Upcoming or past events associated with this place or organization.""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}