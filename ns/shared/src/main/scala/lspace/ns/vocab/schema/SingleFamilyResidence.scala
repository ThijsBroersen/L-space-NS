package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object SingleFamilyResidence extends OntologyDef(
        iri = "http://schema.org/SingleFamilyResidence",
        iris = Set("http://schema.org/SingleFamilyResidence"),
        label = "SingleFamilyResidence",
        comment = """Residence type: Single-family home.""",
        `@extends` = () => List(House.ontology)
       ){
}