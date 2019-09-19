package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object colleague extends PropertyDef(
        iri = "http://schema.org/colleague",
        iris = Set("http://schema.org/colleague"),
        label = "colleague",
        comment = """A colleague of the person.""",
        `@extends` = () => List(),
        `@range` = () => List(Person.ontology, URL.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}