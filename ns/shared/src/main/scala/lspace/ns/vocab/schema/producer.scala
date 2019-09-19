package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object producer extends PropertyDef(
        iri = "http://schema.org/producer",
        iris = Set("http://schema.org/producer"),
        label = "producer",
        comment = """The person or organization who produced the work (e.g. music album, movie, tv/radio series etc.).""",
        `@extends` = () => List(),
        `@range` = () => List(Organization.ontology, Person.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}