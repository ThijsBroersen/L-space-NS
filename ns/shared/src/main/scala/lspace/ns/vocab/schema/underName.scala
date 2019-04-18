package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object underName extends PropertyDef(
        iri = "http://schema.org/underName",
        iris = Set("http://schema.org/underName"),
        label = "underName",
        comment = """The person or organization the reservation or ticket is for.""",
        `@extends` = () => List(),
        `@range` = () => List(Organization.ontology, Person.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}