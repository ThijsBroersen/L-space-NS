package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object releaseNotes extends PropertyDef(
        iri = "http://schema.org/releaseNotes",
        iris = Set("http://schema.org/releaseNotes"),
        label = "releaseNotes",
        comment = """Description of what changed in this version.""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology, URL.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}