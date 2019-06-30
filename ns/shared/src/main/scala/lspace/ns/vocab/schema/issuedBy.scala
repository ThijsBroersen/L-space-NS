package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object issuedBy extends PropertyDef(
        iri = "http://schema.org/issuedBy",
        iris = Set("http://schema.org/issuedBy"),
        label = "issuedBy",
        comment = """The organization issuing the ticket or permit.""",
        `@extends` = () => List(),
        `@range` = () => List(Organization.ontology)
       ){
}