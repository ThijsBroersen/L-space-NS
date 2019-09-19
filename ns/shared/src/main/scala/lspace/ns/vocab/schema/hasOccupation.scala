package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object hasOccupation extends PropertyDef(
        iri = "http://schema.org/hasOccupation",
        iris = Set("http://schema.org/hasOccupation"),
        label = "hasOccupation",
        comment = """The Person's occupation. For past professions, use Role for expressing dates.""",
        `@extends` = () => List(),
        `@range` = () => List(Occupation.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}