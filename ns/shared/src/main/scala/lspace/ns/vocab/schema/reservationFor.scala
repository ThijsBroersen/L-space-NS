package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object reservationFor extends PropertyDef(
        iri = "http://schema.org/reservationFor",
        iris = Set("http://schema.org/reservationFor"),
        label = "reservationFor",
        comment = """The thing -- flight, event, restaurant,etc. being reserved.""",
        `@extends` = () => List(),
        `@range` = () => List(Thing.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}