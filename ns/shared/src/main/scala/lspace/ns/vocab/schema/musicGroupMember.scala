package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object musicGroupMember extends PropertyDef(
        iri = "http://schema.org/musicGroupMember",
        iris = Set("http://schema.org/musicGroupMember"),
        label = "musicGroupMember",
        comment = """A member of a music group&#x2014;for example, John, Paul, George, or Ringo.""",
        `@extends` = () => List(),
        `@range` = () => List(Person.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}