package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Notary extends OntologyDef(
        iri = "http://schema.org/Notary",
        iris = Set("http://schema.org/Notary"),
        label = "Notary",
        comment = """A notary.""",
        `@extends` = () => List(LegalService.ontology)
       ){
}