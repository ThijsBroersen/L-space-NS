package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object organizer extends PropertyDef(
        iri = "https://schema.org/organizer",
        iris = Set("https://schema.org/organizer"),
        label = "organizer",
        comment = """An organizer of an Event.""",
        `@extends` = () => List(),
        `@range` = () => List(Person)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}