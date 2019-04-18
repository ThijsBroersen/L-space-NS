package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object hasMap extends PropertyDef(
        iri = "http://schema.org/hasMap",
        iris = Set("http://schema.org/hasMap"),
        label = "hasMap",
        comment = """A URL to a map of the place.""",
        `@extends` = () => List(),
        `@range` = () => List(URL.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}