package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object MedicalTherapy extends OntologyDef(
        iri = "http://schema.org/MedicalTherapy",
        iris = Set("http://schema.org/MedicalTherapy"),
        label = "MedicalTherapy",
        comment = """Any medical intervention designed to prevent, treat, and cure human diseases and medical conditions, including both curative and palliative therapies. Medical therapies are typically processes of care relying upon pharmacotherapy, behavioral therapy, supportive therapy (with fluid or nutrition for example), or detoxification (e.g. hemodialysis) aimed at improving or preventing a health condition.""",
        `@extends` = () => List(TherapeuticProcedure.ontology)
       ){
}