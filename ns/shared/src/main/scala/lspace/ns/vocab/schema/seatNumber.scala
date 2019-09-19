package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object seatNumber extends PropertyDef(
        iri = "http://schema.org/seatNumber",
        iris = Set("http://schema.org/seatNumber"),
        label = "seatNumber",
        comment = """The location of the reserved seat (e.g., 27).""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}