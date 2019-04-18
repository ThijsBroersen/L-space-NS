package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object broadcastFrequencyValue extends PropertyDef(
        iri = "http://schema.org/broadcastFrequencyValue",
        iris = Set("http://schema.org/broadcastFrequencyValue"),
        label = "broadcastFrequencyValue",
        comment = """The frequency in MHz for a particular broadcast.""",
        `@extends` = () => List(),
        `@range` = () => List(Number.ontology, QuantitativeValue.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}