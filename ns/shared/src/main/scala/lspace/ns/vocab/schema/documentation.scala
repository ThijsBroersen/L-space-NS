package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object documentation extends PropertyDef(
        iri = "http://schema.org/documentation",
        iris = Set("http://schema.org/documentation"),
        label = "documentation",
        comment = """Further documentation describing the Web API in more detail.""",
        `@extends` = List(),
        `@range` = List(CreativeWork.ontology, URL.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}