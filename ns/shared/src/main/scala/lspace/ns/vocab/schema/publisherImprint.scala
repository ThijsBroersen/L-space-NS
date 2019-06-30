package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object publisherImprint extends PropertyDef(
        iri = "http://schema.org/publisherImprint",
        iris = Set("http://schema.org/publisherImprint"),
        label = "publisherImprint",
        comment = """The publishing division which published the comic.""",
        `@extends` = () => List(),
        `@range` = () => List(Organization.ontology)
       ){
}