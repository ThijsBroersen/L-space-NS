package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object performers extends PropertyDef(
        iri = "http://schema.org/performers",
        iris = Set("http://schema.org/performers"),
        label = "performers",
        comment = """The main performer or performers of the event&#x2014;for example, a presenter, musician, or actor.""",
        `@extends` = List(),
        `@range` = List(Person.ontology, Organization.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}