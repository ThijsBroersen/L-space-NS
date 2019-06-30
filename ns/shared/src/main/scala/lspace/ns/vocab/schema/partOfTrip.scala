package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object partOfTrip extends PropertyDef(
        iri = "http://schema.org/partOfTrip",
        iris = Set("http://schema.org/partOfTrip"),
        label = "partOfTrip",
        comment = """Identifies that this <a class="localLink" href="http://schema.org/Trip">Trip</a> is a subTrip of another Trip.  For example Day 1, Day 2, etc. of a multi-day trip.""",
        `@extends` = () => List(),
        `@range` = () => List(Trip.ontology)
       ){
}