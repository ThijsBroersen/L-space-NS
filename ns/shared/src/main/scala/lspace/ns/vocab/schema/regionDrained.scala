package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object regionDrained extends PropertyDef(
        iri = "http://schema.org/regionDrained",
        iris = Set("http://schema.org/regionDrained"),
        label = "regionDrained",
        comment = """The anatomical or organ system drained by this vessel; generally refers to a specific part of an organ.""",
        `@extends` = () => List(),
        `@range` = () => List(AnatomicalStructure.ontology, AnatomicalSystem.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}