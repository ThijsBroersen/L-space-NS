package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object provider extends PropertyDef(
        iri = "http://schema.org/provider",
        iris = Set("http://schema.org/provider"),
        label = "provider",
        comment = """The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.""",
        `@extends` = () => List(),
        `@range` = () => List(Person.ontology, Organization.ontology)
       ){
}