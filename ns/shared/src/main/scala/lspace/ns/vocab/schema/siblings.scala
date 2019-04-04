package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object siblings extends PropertyDef(
        iri = "https://schema.org/siblings",
        iris = Set("https://schema.org/siblings"),
        label = "siblings",
        comment = """A sibling of the person.""",
        `@extends` = () => List(),
        `@range` = () => List(Person.ontology)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}