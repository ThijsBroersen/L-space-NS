package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ContactPoint extends OntologyDef(
        iri = "http://schema.org/ContactPoint",
        iris = Set("http://schema.org/ContactPoint"),
        label = "ContactPoint",
        comment = """A contact point&#x2014;for example, a Customer Complaints department.""",
        `@extends` = () => List(StructuredValue.ontology)
       ){
object keys extends lspace.ns.vocab.schema.StructuredValue.Properties{
lazy val productSupported = lspace.ns.vocab.schema.productSupported.property
lazy val contactType = lspace.ns.vocab.schema.contactType.property
lazy val email = lspace.ns.vocab.schema.email.property
}
override lazy val properties: List[LProperty] = List(productSupported, contactType, email)
trait Properties extends lspace.ns.vocab.schema.StructuredValue.Properties{
lazy val productSupported = lspace.ns.vocab.schema.productSupported.property
lazy val contactType = lspace.ns.vocab.schema.contactType.property
lazy val email = lspace.ns.vocab.schema.email.property
}
}