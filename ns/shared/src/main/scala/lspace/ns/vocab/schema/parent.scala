package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object parent extends PropertyDef(
        iri = "http://schema.org/parent",
        iris = Set("http://schema.org/parent"),
        label = "parent",
        comment = """A parent of this person.""",
        `@extends` = () => List(),
        `@range` = () => List(Person.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}