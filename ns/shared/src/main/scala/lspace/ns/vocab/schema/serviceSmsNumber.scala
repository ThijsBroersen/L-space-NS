package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object serviceSmsNumber extends PropertyDef(
        iri = "http://schema.org/serviceSmsNumber",
        iris = Set("http://schema.org/serviceSmsNumber"),
        label = "serviceSmsNumber",
        comment = """The number to access the service by text message.""",
        `@extends` = List(),
        `@range` = List(ContactPoint.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}