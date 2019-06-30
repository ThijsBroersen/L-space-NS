package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object MedicalImagingTechnique extends OntologyDef(
        iri = "http://schema.org/MedicalImagingTechnique",
        iris = Set("http://schema.org/MedicalImagingTechnique"),
        label = "MedicalImagingTechnique",
        comment = """Any medical imaging modality typically used for diagnostic purposes. Enumerated type.""",
        `@extends` = () => List(MedicalEnumeration.ontology)
       ){
}