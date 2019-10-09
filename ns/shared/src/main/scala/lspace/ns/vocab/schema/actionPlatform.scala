package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object actionPlatform extends PropertyDef(
        iri = "http://schema.org/actionPlatform",
        iris = Set("http://schema.org/actionPlatform"),
        label = "actionPlatform",
        comment = """The high level platform(s) where the Action can be performed for the given URL. To specify a specific application or operating system instance, use actionApplication.""",
        `@extends` = List(),
        `@range` = List(`@string`, URL.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}