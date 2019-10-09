package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object readBy extends PropertyDef(
        iri = "http://schema.org/readBy",
        iris = Set("http://schema.org/readBy"),
        label = "readBy",
        comment = """A person who reads (performs) the audiobook.""",
        `@extends` = List(actor.property),
        `@range` = List(Person.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.actor.Properties
}