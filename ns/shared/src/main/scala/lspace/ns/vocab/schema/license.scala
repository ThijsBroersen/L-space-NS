package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object license extends PropertyDef(
        iri = "http://schema.org/license",
        iris = Set("http://schema.org/license"),
        label = "license",
        comment = """A license document that applies to this content, typically indicated by URL.""",
        `@extends` = () => List(),
        `@range` = () => List(CreativeWork.ontology, URL.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}