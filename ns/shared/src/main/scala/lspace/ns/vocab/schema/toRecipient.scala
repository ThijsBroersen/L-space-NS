package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object toRecipient extends PropertyDef(
        iri = "http://schema.org/toRecipient",
        iris = Set("http://schema.org/toRecipient"),
        label = "toRecipient",
        comment = """A sub property of recipient. The recipient who was directly sent the message.""",
        `@extends` = List(recipient.property),
        `@range` = List(Audience.ontology, Person.ontology, ContactPoint.ontology, Organization.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.recipient.Properties
}