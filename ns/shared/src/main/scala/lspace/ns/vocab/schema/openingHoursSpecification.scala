package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object openingHoursSpecification extends PropertyDef(
        iri = "https://schema.org/openingHoursSpecification",
        iris = Set("https://schema.org/openingHoursSpecification"),
        label = "openingHoursSpecification",
        comment = """The opening hours of a certain place.""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}