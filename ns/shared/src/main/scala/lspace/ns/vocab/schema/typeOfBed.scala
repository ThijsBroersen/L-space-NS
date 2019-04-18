package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object typeOfBed extends PropertyDef(
        iri = "http://schema.org/typeOfBed",
        iris = Set("http://schema.org/typeOfBed"),
        label = "typeOfBed",
        comment = """The type of bed to which the BedDetail refers, i.e. the type of bed available in the quantity indicated by quantity.""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}