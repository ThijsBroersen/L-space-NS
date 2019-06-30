package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object performer extends PropertyDef(
        iri = "http://schema.org/performer",
        iris = Set("http://schema.org/performer"),
        label = "performer",
        comment = """A performer at the event&#x2014;for example, a presenter, musician, musical group or actor.""",
        `@extends` = () => List(),
        `@range` = () => List(Organization.ontology)
       ){
}