package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object busNumber extends PropertyDef(
        iri = "http://schema.org/busNumber",
        iris = Set("http://schema.org/busNumber"),
        label = "busNumber",
        comment = """The unique identifier for the bus.""",
        `@extends` = List(),
        `@range` = List(`@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}