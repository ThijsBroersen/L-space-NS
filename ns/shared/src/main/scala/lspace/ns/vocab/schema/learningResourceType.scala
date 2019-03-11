package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object learningResourceType extends PropertyDef(
        iri = "https://schema.org/learningResourceType",
        iris = Set("https://schema.org/learningResourceType"),
        label = "learningResourceType",
        comment = """The predominant type or kind characterizing the learning resource. For example, 'presentation', 'handout'.""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}