package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object PostalAddress extends OntologyDef(
        iri = "http://schema.org/PostalAddress",
        iris = Set("http://schema.org/PostalAddress"),
        label = "PostalAddress",
        comment = """The mailing address.""",
        `@extends` = () => List(ContactPoint.ontology)
       ){
object keys extends lspace.ns.vocab.schema.ContactPoint.Properties{
lazy val addressLocality = lspace.ns.vocab.schema.addressLocality.property
}
override lazy val properties: List[LProperty] = List(addressLocality)
trait Properties extends lspace.ns.vocab.schema.ContactPoint.Properties{
lazy val addressLocality = lspace.ns.vocab.schema.addressLocality.property
}
}