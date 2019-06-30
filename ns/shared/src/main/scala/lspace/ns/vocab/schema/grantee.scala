package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object grantee extends PropertyDef(
        iri = "http://schema.org/grantee",
        iris = Set("http://schema.org/grantee"),
        label = "grantee",
        comment = """The person, organization, contact point, or audience that has been granted this permission.""",
        `@extends` = () => List(),
        `@range` = () => List(Organization.ontology, ContactPoint.ontology, Audience.ontology, Person.ontology)
       ){
}