package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object affiliation extends PropertyDef(
        iri = "https://schema.org/affiliation",
        iris = Set("https://schema.org/affiliation"),
        label = "affiliation",
        comment = """An organization that this person is affiliated with. For example, a school/university, a club, or a team.""",
        `@extends` = () => List(memberOf.property),
        `@range` = () => List()
       ){

override lazy val properties: List[Property] = List()
trait Properties extends lspace.ns.vocab.schema.memberOf.Properties
}