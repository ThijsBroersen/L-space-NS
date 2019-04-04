package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object performer extends PropertyDef(
        iri = "https://schema.org/performer",
        iris = Set("https://schema.org/performer"),
        label = "performer",
        comment = """A performer at the event&#x2014;for example, a presenter, musician, musical group or actor.""",
        `@extends` = () => List(),
        `@range` = () => List(Person.ontology)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}