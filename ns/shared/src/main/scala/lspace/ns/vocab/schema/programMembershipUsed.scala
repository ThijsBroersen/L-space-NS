package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object programMembershipUsed extends PropertyDef(
        iri = "http://schema.org/programMembershipUsed",
        iris = Set("http://schema.org/programMembershipUsed"),
        label = "programMembershipUsed",
        comment = """Any membership in a frequent flyer, hotel loyalty program, etc. being applied to the reservation.""",
        `@extends` = () => List(),
        `@range` = () => List(ProgramMembership.ontology)
       ){
}