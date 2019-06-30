package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ServiceChannel extends OntologyDef(
        iri = "http://schema.org/ServiceChannel",
        iris = Set("http://schema.org/ServiceChannel"),
        label = "ServiceChannel",
        comment = """A means for accessing a service, e.g. a government office location, web site, or phone number.""",
        `@extends` = () => List(Intangible.ontology)
       ){
}