package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object broadcaster extends PropertyDef(
        iri = "http://schema.org/broadcaster",
        iris = Set("http://schema.org/broadcaster"),
        label = "broadcaster",
        comment = """The organization owning or operating the broadcast service.""",
        `@extends` = List(),
        `@range` = List(Organization.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}