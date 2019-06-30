package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Service extends OntologyDef(
        iri = "http://schema.org/Service",
        iris = Set("http://schema.org/Service"),
        label = "Service",
        comment = """A service provided by an organization, e.g. delivery service, print services, etc.""",
        `@extends` = () => List(Intangible.ontology)
       ){
}