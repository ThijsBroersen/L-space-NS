package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object ccRecipient extends PropertyDef(
        iri = "http://schema.org/ccRecipient",
        iris = Set("http://schema.org/ccRecipient"),
        label = "ccRecipient",
        comment = """A sub property of recipient. The recipient copied on a message.""",
        `@extends` = List(recipient.property),
        `@range` = List(Organization.ontology, Person.ontology, ContactPoint.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.recipient.Properties
}