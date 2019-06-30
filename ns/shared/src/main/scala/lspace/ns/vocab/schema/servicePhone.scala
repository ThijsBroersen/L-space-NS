package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object servicePhone extends PropertyDef(
        iri = "http://schema.org/servicePhone",
        iris = Set("http://schema.org/servicePhone"),
        label = "servicePhone",
        comment = """The phone number to use to access the service.""",
        `@extends` = () => List(),
        `@range` = () => List(ContactPoint.ontology)
       ){
}