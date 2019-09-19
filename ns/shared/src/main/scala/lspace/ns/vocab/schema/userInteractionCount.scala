package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object userInteractionCount extends PropertyDef(
        iri = "http://schema.org/userInteractionCount",
        iris = Set("http://schema.org/userInteractionCount"),
        label = "userInteractionCount",
        comment = """The number of interactions for the CreativeWork using the WebSite or SoftwareApplication.""",
        `@extends` = () => List(),
        `@range` = () => List(`@int`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}