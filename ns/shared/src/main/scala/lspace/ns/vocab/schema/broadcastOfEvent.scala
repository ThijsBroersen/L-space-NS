package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object broadcastOfEvent extends PropertyDef(
        iri = "http://schema.org/broadcastOfEvent",
        iris = Set("http://schema.org/broadcastOfEvent"),
        label = "broadcastOfEvent",
        comment = """The event being broadcast such as a sporting event or awards ceremony.""",
        `@extends` = List(),
        `@range` = List(Event.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}