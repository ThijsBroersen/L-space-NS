package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object athlete extends PropertyDef(
        iri = "http://schema.org/athlete",
        iris = Set("http://schema.org/athlete"),
        label = "athlete",
        comment = """A person that acts as performing member of a sports team; a player as opposed to a coach.""",
        `@extends` = List(),
        `@range` = List(Person.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}