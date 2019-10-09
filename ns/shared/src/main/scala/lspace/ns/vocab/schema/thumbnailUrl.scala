package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object thumbnailUrl extends PropertyDef(
        iri = "http://schema.org/thumbnailUrl",
        iris = Set("http://schema.org/thumbnailUrl"),
        label = "thumbnailUrl",
        comment = """A thumbnail image relevant to the Thing.""",
        `@extends` = List(),
        `@range` = List(URL.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}