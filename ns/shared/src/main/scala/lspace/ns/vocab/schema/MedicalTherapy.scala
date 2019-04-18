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
object keys extends lspace.ns.vocab.schema.TherapeuticProcedure.Properties{
lazy val contraindication = lspace.ns.vocab.schema.contraindication.property
lazy val seriousAdverseOutcome = lspace.ns.vocab.schema.seriousAdverseOutcome.property
override lazy val indication = lspace.ns.vocab.schema.indication.property}
override lazy val properties: List[LProperty] = List(contraindication, seriousAdverseOutcome)
trait Properties extends lspace.ns.vocab.schema.TherapeuticProcedure.Properties{
lazy val contraindication = lspace.ns.vocab.schema.contraindication.property
lazy val seriousAdverseOutcome = lspace.ns.vocab.schema.seriousAdverseOutcome.property
override lazy val indication = lspace.ns.vocab.schema.indication.property}
}