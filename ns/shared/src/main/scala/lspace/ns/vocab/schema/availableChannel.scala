package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object availableChannel extends PropertyDef(
        iri = "http://schema.org/availableChannel",
        iris = Set("http://schema.org/availableChannel"),
        label = "availableChannel",
        comment = """A means of accessing the service (e.g. a phone bank, a web site, a location, etc.).""",
        `@extends` = () => List(),
        `@range` = () => List(ServiceChannel.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}