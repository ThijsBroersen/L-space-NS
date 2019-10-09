package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object spouse extends PropertyDef(
        iri = "http://schema.org/spouse",
        iris = Set("http://schema.org/spouse"),
        label = "spouse",
        comment = """The person's spouse.""",
        `@extends` = List(),
        `@range` = List(Person.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}