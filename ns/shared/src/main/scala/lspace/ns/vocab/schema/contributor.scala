package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object contributor extends PropertyDef(
        iri = "http://schema.org/contributor",
        iris = Set("http://schema.org/contributor"),
        label = "contributor",
        comment = """A secondary contributor to the CreativeWork or Event.""",
        `@extends` = List(),
        `@range` = List(Organization.ontology, Person.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}