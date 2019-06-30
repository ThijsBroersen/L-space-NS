package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object State extends OntologyDef(
        iri = "http://schema.org/State",
        iris = Set("http://schema.org/State"),
        label = "State",
        comment = """A state or province of a country.""",
        `@extends` = () => List(AdministrativeArea.ontology)
       ){
}