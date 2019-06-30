package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Country extends OntologyDef(
        iri = "http://schema.org/Country",
        iris = Set("http://schema.org/Country"),
        label = "Country",
        comment = """A country.""",
        `@extends` = () => List(AdministrativeArea.ontology)
       ){
}