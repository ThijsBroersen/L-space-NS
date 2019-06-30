package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object agent extends PropertyDef(
        iri = "http://schema.org/agent",
        iris = Set("http://schema.org/agent"),
        label = "agent",
        comment = """The direct performer or driver of the action (animate or inanimate). e.g. <em>John</em> wrote a book.""",
        `@extends` = () => List(),
        `@range` = () => List(Organization.ontology, Person.ontology)
       ){
}