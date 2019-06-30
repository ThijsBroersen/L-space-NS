package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object roleName extends PropertyDef(
        iri = "http://schema.org/roleName",
        iris = Set("http://schema.org/roleName"),
        label = "roleName",
        comment = """A role played, performed or filled by a person or organization. For example, the team of creators for a comic book might fill the roles named 'inker', 'penciller', and 'letterer'; or an athlete in a SportsTeam might play in the position named 'Quarterback'.""",
        `@extends` = () => List(),
        `@range` = () => List(`@string`, URL.ontology)
       ){
}