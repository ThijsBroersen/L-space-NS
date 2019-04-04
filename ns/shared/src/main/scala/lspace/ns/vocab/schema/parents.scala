package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object parents extends PropertyDef(
        iri = "https://schema.org/parents",
        iris = Set("https://schema.org/parents"),
        label = "parents",
        comment = """A parents of the person.""",
        `@extends` = () => List(),
        `@range` = () => List(Person.ontology)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}