package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object MedicalGuidelineContraindication extends OntologyDef(
        iri = "http://schema.org/MedicalGuidelineContraindication",
        iris = Set("http://schema.org/MedicalGuidelineContraindication"),
        label = "MedicalGuidelineContraindication",
        comment = """A guideline contraindication that designates a process as harmful and where quality of the data supporting the contraindication is sound.""",
        `@extends` = () => List(MedicalGuideline.ontology)
       ){
}