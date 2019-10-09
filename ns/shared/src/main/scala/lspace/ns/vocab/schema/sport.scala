package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object sport extends PropertyDef(
        iri = "http://schema.org/sport",
        iris = Set("http://schema.org/sport"),
        label = "sport",
        comment = """A type of sport (e.g. Baseball).""",
        `@extends` = List(),
        `@range` = List(`@string`, URL.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}