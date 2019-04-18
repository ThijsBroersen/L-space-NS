package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object inker extends PropertyDef(
        iri = "http://schema.org/inker",
        iris = Set("http://schema.org/inker"),
        label = "inker",
        comment = """The individual who traces over the pencil drawings in ink after pencils are complete.""",
        `@extends` = () => List(),
        `@range` = () => List(Person.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}