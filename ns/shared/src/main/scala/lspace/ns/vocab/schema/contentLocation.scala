package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object contentLocation extends PropertyDef(
        iri = "https://schema.org/contentLocation",
        iris = Set("https://schema.org/contentLocation"),
        label = "contentLocation",
        comment = """The location depicted or described in the content. For example, the location in a photograph or painting.""",
        `@extends` = () => List(),
        `@range` = () => List(Place.ontology)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}