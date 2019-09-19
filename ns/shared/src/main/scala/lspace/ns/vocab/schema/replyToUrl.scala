package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object replyToUrl extends PropertyDef(
        iri = "http://schema.org/replyToUrl",
        iris = Set("http://schema.org/replyToUrl"),
        label = "replyToUrl",
        comment = """The URL at which a reply may be posted to the specified UserComment.""",
        `@extends` = () => List(),
        `@range` = () => List(URL.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}