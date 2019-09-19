package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object doseSchedule extends PropertyDef(
        iri = "http://schema.org/doseSchedule",
        iris = Set("http://schema.org/doseSchedule"),
        label = "doseSchedule",
        comment = """A dosing schedule for the drug for a given population, either observed, recommended, or maximum dose based on the type used.""",
        `@extends` = () => List(),
        `@range` = () => List(DoseSchedule.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}