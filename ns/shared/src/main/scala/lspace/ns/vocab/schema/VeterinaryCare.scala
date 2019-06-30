package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object VeterinaryCare extends OntologyDef(
        iri = "http://schema.org/VeterinaryCare",
        iris = Set("http://schema.org/VeterinaryCare"),
        label = "VeterinaryCare",
        comment = """A vet's office.""",
        `@extends` = () => List(MedicalOrganization.ontology)
       ){
}