package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object downvoteCount extends PropertyDef(
        iri = "http://schema.org/downvoteCount",
        iris = Set("http://schema.org/downvoteCount"),
        label = "downvoteCount",
        comment = """The number of downvotes this question, answer or comment has received from the community.""",
        `@extends` = () => List(),
        `@range` = () => List(`@int`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}