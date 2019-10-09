package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object icaoCode extends PropertyDef(
        iri = "http://schema.org/icaoCode",
        iris = Set("http://schema.org/icaoCode"),
        label = "icaoCode",
        comment = """ICAO identifier for an airport.""",
        `@extends` = List(),
        `@range` = List(`@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}