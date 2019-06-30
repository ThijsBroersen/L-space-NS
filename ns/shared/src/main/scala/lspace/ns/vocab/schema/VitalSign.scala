package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object VitalSign extends OntologyDef(
        iri = "http://schema.org/VitalSign",
        iris = Set("http://schema.org/VitalSign"),
        label = "VitalSign",
        comment = """Vital signs are measures of various physiological functions in order to assess the most basic body functions.""",
        `@extends` = () => List(MedicalSign.ontology)
       ){
}