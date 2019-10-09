package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object events extends PropertyDef(
        iri = "http://schema.org/events",
        iris = Set("http://schema.org/events"),
        label = "events",
        comment = """Upcoming or past events associated with this place or organization.""",
        `@extends` = List(),
        `@range` = List(Event.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}