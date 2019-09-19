package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object sportsActivityLocation extends PropertyDef(
        iri = "http://schema.org/sportsActivityLocation",
        iris = Set("http://schema.org/sportsActivityLocation"),
        label = "sportsActivityLocation",
        comment = """A sub property of location. The sports activity location where this action occurred.""",
        `@extends` = () => List(location.property),
        `@range` = () => List(SportsActivityLocation.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.location.Properties
}