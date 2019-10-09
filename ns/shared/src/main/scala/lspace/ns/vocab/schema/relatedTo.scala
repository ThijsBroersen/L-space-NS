package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object relatedTo extends PropertyDef(
        iri = "http://schema.org/relatedTo",
        iris = Set("http://schema.org/relatedTo"),
        label = "relatedTo",
        comment = """The most generic familial relation.""",
        `@extends` = List(),
        `@range` = List(Person.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}