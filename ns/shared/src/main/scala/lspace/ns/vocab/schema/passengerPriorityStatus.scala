package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object passengerPriorityStatus extends PropertyDef(
        iri = "http://schema.org/passengerPriorityStatus",
        iris = Set("http://schema.org/passengerPriorityStatus"),
        label = "passengerPriorityStatus",
        comment = """The priority status assigned to a passenger for security or boarding (e.g. FastTrack or Priority).""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology, QualitativeValue.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}