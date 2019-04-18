package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object significantLinks extends PropertyDef(
        iri = "http://schema.org/significantLinks",
        iris = Set("http://schema.org/significantLinks"),
        label = "significantLinks",
        comment = """The most significant URLs on the page. Typically, these are the non-navigation links that are clicked on the most.""",
        `@extends` = () => List(),
        `@range` = () => List(URL.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}