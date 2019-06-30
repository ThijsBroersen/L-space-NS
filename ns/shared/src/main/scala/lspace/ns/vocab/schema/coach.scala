package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object coach extends PropertyDef(
        iri = "http://schema.org/coach",
        iris = Set("http://schema.org/coach"),
        label = "coach",
        comment = """A person that acts in a coaching role for a sports team.""",
        `@extends` = () => List(),
        `@range` = () => List(Person.ontology)
       ){
}