package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object serviceLocation extends PropertyDef(
        iri = "http://schema.org/serviceLocation",
        iris = Set("http://schema.org/serviceLocation"),
        label = "serviceLocation",
        comment = """The location (e.g. civic structure, local business, etc.) where a person can go to access the service.""",
        `@extends` = () => List(),
        `@range` = () => List(Place.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}