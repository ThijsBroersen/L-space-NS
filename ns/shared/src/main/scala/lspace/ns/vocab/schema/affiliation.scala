package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object affiliation extends PropertyDef(
        iri = "http://schema.org/affiliation",
        iris = Set("http://schema.org/affiliation"),
        label = "affiliation",
        comment = """An organization that this person is affiliated with. For example, a school/university, a club, or a team.""",
        `@extends` = () => List(memberOf.property),
        `@range` = () => List(Organization.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.memberOf.Properties
}