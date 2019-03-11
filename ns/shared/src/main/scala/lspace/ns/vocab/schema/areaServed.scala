package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object areaServed extends PropertyDef(
        iri = "https://schema.org/areaServed",
        iris = Set("https://schema.org/areaServed"),
        label = "areaServed",
        comment = """The geographic area where a service or offered item is provided.""",
        `@extends` = () => List(),
        `@range` = () => List(Place)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}