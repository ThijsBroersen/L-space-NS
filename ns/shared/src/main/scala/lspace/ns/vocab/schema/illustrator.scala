package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object illustrator extends PropertyDef(
        iri = "http://schema.org/illustrator",
        iris = Set("http://schema.org/illustrator"),
        label = "illustrator",
        comment = """The illustrator of the book.""",
        `@extends` = () => List(),
        `@range` = () => List(Person.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}