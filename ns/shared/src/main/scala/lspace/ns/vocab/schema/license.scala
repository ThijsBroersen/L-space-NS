package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object license extends PropertyDef(
        iri = "https://schema.org/license",
        iris = Set("https://schema.org/license"),
        label = "license",
        comment = """A license document that applies to this content, typically indicated by URL.""",
        `@extends` = () => List(),
        `@range` = () => List(`@url`, CreativeWork.ontology)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}