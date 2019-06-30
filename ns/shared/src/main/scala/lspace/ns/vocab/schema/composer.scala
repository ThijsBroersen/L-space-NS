package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object composer extends PropertyDef(
        iri = "http://schema.org/composer",
        iris = Set("http://schema.org/composer"),
        label = "composer",
        comment = """The person or organization who wrote a composition, or who is the composer of a work performed at some event.""",
        `@extends` = () => List(),
        `@range` = () => List(Organization.ontology)
       ){
}