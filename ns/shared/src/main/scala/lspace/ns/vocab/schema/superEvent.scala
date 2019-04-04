package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object superEvent extends PropertyDef(
        iri = "https://schema.org/superEvent",
        iris = Set("https://schema.org/superEvent"),
        label = "superEvent",
        comment = """An event that this event is a part of. For example, a collection of individual music performances might each have a music festival as their superEvent.""",
        `@extends` = () => List(),
        `@range` = () => List(Event.ontology)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}