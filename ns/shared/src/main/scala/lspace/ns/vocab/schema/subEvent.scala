package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object subEvent extends PropertyDef(
        iri = "https://schema.org/subEvent",
        iris = Set("https://schema.org/subEvent"),
        label = "subEvent",
        comment = """An Event that is part of this event. For example, a conference event includes many presentations, each of which is a subEvent of the conference.""",
        `@extends` = () => List(),
        `@range` = () => List(Event.ontology)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}