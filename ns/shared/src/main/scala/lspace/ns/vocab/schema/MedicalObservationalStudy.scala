package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object MedicalObservationalStudy extends OntologyDef(
        iri = "http://schema.org/MedicalObservationalStudy",
        iris = Set("http://schema.org/MedicalObservationalStudy"),
        label = "MedicalObservationalStudy",
        comment = """An observational study is a type of medical study that attempts to infer the possible effect of a treatment through observation of a cohort of subjects over a period of time. In an observational study, the assignment of subjects into treatment groups versus control groups is outside the control of the investigator. This is in contrast with controlled studies, such as the randomized controlled trials represented by MedicalTrial, where each subject is randomly assigned to a treatment group or a control group before the start of the treatment.""",
        `@extends` = () => List(MedicalStudy.ontology)
       ){
}