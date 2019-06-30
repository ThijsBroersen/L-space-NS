package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object subTrip extends PropertyDef(
        iri = "http://schema.org/subTrip",
        iris = Set("http://schema.org/subTrip"),
        label = "subTrip",
        comment = """Identifies a <a class="localLink" href="http://schema.org/Trip">Trip</a> that is a subTrip of this Trip.  For example Day 1, Day 2, etc. of a multi-day trip.""",
        `@extends` = () => List(),
        `@range` = () => List(Trip.ontology)
       ){
}