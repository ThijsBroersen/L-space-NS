package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object reservedTicket extends PropertyDef(
        iri = "http://schema.org/reservedTicket",
        iris = Set("http://schema.org/reservedTicket"),
        label = "reservedTicket",
        comment = """A ticket associated with the reservation.""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){
}