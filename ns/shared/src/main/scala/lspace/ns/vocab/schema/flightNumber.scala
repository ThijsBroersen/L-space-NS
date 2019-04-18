package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object flightNumber extends PropertyDef(
        iri = "http://schema.org/flightNumber",
        iris = Set("http://schema.org/flightNumber"),
        label = "flightNumber",
        comment = """The unique identifier for a flight including the airline IATA code. For example, if describing United flight 110, where the IATA code for United is 'UA', the flightNumber is 'UA110'.""",
        `@extends` = () => List(identifier.property),
        `@range` = () => List(Text.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.identifier.Properties
}