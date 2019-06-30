package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object MedicalCode extends OntologyDef(
        iri = "http://schema.org/MedicalCode",
        iris = Set("http://schema.org/MedicalCode"),
        label = "MedicalCode",
        comment = """A code for a medical entity.""",
        `@extends` = () => List(MedicalIntangible.ontology, CategoryCode.ontology)
       ){
}