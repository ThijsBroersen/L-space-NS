package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object audience extends PropertyDef(
        iri = "http://schema.org/audience",
        iris = Set("http://schema.org/audience"),
        label = "audience",
        comment = """An intended audience, i.e. a group for whom something was created.""",
        `@extends` = List(),
        `@range` = List(Audience.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}