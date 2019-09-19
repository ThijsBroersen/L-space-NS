package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object targetUrl extends PropertyDef(
        iri = "http://schema.org/targetUrl",
        iris = Set("http://schema.org/targetUrl"),
        label = "targetUrl",
        comment = """The URL of a node in an established educational framework.""",
        `@extends` = () => List(),
        `@range` = () => List(URL.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}