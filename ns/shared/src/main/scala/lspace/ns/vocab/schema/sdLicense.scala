package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object sdLicense extends PropertyDef(
        iri = "http://schema.org/sdLicense",
        iris = Set("http://schema.org/sdLicense"),
        label = "sdLicense",
        comment = """A license document that applies to this structured data, typically indicated by URL.""",
        `@extends` = List(),
        `@range` = List(CreativeWork.ontology, URL.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}