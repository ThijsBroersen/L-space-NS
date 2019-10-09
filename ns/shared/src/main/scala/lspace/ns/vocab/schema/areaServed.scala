package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object areaServed extends PropertyDef(
        iri = "http://schema.org/areaServed",
        iris = Set("http://schema.org/areaServed"),
        label = "areaServed",
        comment = """The geographic area where a service or offered item is provided.""",
        `@extends` = List(),
        `@range` = List(AdministrativeArea.ontology, GeoShape.ontology, Place.ontology, `@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}