package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ContactPointOption extends OntologyDef(
        iri = "http://schema.org/ContactPointOption",
        iris = Set("http://schema.org/ContactPointOption"),
        label = "ContactPointOption",
        comment = """Enumerated options related to a ContactPoint.""",
        `@extends` = () => List(Enumeration.ontology)
       ){
}