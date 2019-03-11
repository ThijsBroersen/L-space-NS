package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object performerIn extends PropertyDef(
        iri = "https://schema.org/performerIn",
        iris = Set("https://schema.org/performerIn"),
        label = "performerIn",
        comment = """Event that this person is a performer or participant in.""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}