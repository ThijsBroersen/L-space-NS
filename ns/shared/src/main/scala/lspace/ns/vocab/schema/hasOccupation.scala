package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object hasOccupation extends PropertyDef(
        iri = "https://schema.org/hasOccupation",
        iris = Set("https://schema.org/hasOccupation"),
        label = "hasOccupation",
        comment = """The Person's occupation. For past professions, use Role for expressing dates.""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}