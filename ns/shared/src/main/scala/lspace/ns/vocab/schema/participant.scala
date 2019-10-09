package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object participant extends PropertyDef(
        iri = "http://schema.org/participant",
        iris = Set("http://schema.org/participant"),
        label = "participant",
        comment = """Other co-agents that participated in the action indirectly. e.g. John wrote a book with <em>Steve</em>.""",
        `@extends` = List(),
        `@range` = List(Organization.ontology, Person.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}