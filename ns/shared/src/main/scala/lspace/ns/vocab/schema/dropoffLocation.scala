package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object dropoffLocation extends PropertyDef(
        iri = "http://schema.org/dropoffLocation",
        iris = Set("http://schema.org/dropoffLocation"),
        label = "dropoffLocation",
        comment = """Where a rental car can be dropped off.""",
        `@extends` = List(),
        `@range` = List(Place.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}