package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object publishedBy extends PropertyDef(
        iri = "http://schema.org/publishedBy",
        iris = Set("http://schema.org/publishedBy"),
        label = "publishedBy",
        comment = """An agent associated with the publication event.""",
        `@extends` = () => List(),
        `@range` = () => List(Organization.ontology, Person.ontology)
       ){
}