package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object relevantOccupation extends PropertyDef(
        iri = "http://schema.org/relevantOccupation",
        iris = Set("http://schema.org/relevantOccupation"),
        label = "relevantOccupation",
        comment = """The Occupation for the JobPosting.""",
        `@extends` = () => List(),
        `@range` = () => List(Occupation.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}