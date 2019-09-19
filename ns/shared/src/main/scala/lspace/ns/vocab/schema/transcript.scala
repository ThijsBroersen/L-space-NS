package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object transcript extends PropertyDef(
        iri = "http://schema.org/transcript",
        iris = Set("http://schema.org/transcript"),
        label = "transcript",
        comment = """If this MediaObject is an AudioObject or VideoObject, the transcript of that object.""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}