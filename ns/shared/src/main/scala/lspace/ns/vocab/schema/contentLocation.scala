package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object contentLocation extends PropertyDef(
        iri = "http://schema.org/contentLocation",
        iris = Set("http://schema.org/contentLocation"),
        label = "contentLocation",
        comment = """The location depicted or described in the content. For example, the location in a photograph or painting.""",
        `@extends` = () => List(),
        `@range` = () => List(Place.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}