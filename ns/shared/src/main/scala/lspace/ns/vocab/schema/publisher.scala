package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object publisher extends PropertyDef(
        iri = "http://schema.org/publisher",
        iris = Set("http://schema.org/publisher"),
        label = "publisher",
        comment = """The publisher of the creative work.""",
        `@extends` = List(),
        `@range` = List(Person.ontology, Organization.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}