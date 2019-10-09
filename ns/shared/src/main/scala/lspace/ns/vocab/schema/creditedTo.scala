package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object creditedTo extends PropertyDef(
        iri = "http://schema.org/creditedTo",
        iris = Set("http://schema.org/creditedTo"),
        label = "creditedTo",
        comment = """The group the release is credited to if different than the byArtist. For example, Red and Blue is credited to "Stefani Germanotta Band", but by Lady Gaga.""",
        `@extends` = List(),
        `@range` = List(Organization.ontology, Person.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}