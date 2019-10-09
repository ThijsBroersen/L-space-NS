package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object liveBlogUpdate extends PropertyDef(
        iri = "http://schema.org/liveBlogUpdate",
        iris = Set("http://schema.org/liveBlogUpdate"),
        label = "liveBlogUpdate",
        comment = """An update to the LiveBlog.""",
        `@extends` = List(),
        `@range` = List(BlogPosting.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}