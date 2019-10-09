package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object servesCuisine extends PropertyDef(
        iri = "http://schema.org/servesCuisine",
        iris = Set("http://schema.org/servesCuisine"),
        label = "servesCuisine",
        comment = """The cuisine of the restaurant.""",
        `@extends` = List(),
        `@range` = List(`@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}