package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object smokingAllowed extends PropertyDef(
        iri = "https://schema.org/smokingAllowed",
        iris = Set("https://schema.org/smokingAllowed"),
        label = "smokingAllowed",
        comment = """Indicates whether it is allowed to smoke in the place, e.g. in the restaurant, hotel or hotel room.""",
        `@extends` = () => List(),
        `@range` = () => List(`@boolean`)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}