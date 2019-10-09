package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object servicePostalAddress extends PropertyDef(
        iri = "http://schema.org/servicePostalAddress",
        iris = Set("http://schema.org/servicePostalAddress"),
        label = "servicePostalAddress",
        comment = """The address for accessing the service by mail.""",
        `@extends` = List(),
        `@range` = List(PostalAddress.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}