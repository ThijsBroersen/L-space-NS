package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object competitor extends PropertyDef(
        iri = "http://schema.org/competitor",
        iris = Set("http://schema.org/competitor"),
        label = "competitor",
        comment = """A competitor in a sports event.""",
        `@extends` = () => List(),
        `@range` = () => List(Person.ontology, SportsTeam.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}