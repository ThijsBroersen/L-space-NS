package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object relatedLink extends PropertyDef(
        iri = "http://schema.org/relatedLink",
        iris = Set("http://schema.org/relatedLink"),
        label = "relatedLink",
        comment = """A link related to this web page, for example to other related web pages.""",
        `@extends` = () => List(),
        `@range` = () => List(URL.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}