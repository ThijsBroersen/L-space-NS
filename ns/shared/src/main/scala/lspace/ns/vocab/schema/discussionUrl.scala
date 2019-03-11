package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object discussionUrl extends PropertyDef(
        iri = "https://schema.org/discussionUrl",
        iris = Set("https://schema.org/discussionUrl"),
        label = "discussionUrl",
        comment = """A link to the page containing the comments of the CreativeWork.""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}