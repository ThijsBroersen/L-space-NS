package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object bccRecipient extends PropertyDef(
        iri = "http://schema.org/bccRecipient",
        iris = Set("http://schema.org/bccRecipient"),
        label = "bccRecipient",
        comment = """A sub property of recipient. The recipient blind copied on a message.""",
        `@extends` = List(recipient.property),
        `@range` = List(ContactPoint.ontology, Person.ontology, Organization.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.recipient.Properties
}