package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object children extends PropertyDef(
        iri = "http://schema.org/children",
        iris = Set("http://schema.org/children"),
        label = "children",
        comment = """A child of the person.""",
        `@extends` = () => List(),
        `@range` = () => List(Person.ontology)
       ){
}