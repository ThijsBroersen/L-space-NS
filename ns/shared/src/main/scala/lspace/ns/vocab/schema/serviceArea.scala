package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object serviceArea extends PropertyDef(
        iri = "http://schema.org/serviceArea",
        iris = Set("http://schema.org/serviceArea"),
        label = "serviceArea",
        comment = """The geographic area where the service is provided.""",
        `@extends` = () => List(),
        `@range` = () => List(Place.ontology, GeoShape.ontology, AdministrativeArea.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}