package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object MedicalStudy extends OntologyDef(
        iri = "http://schema.org/MedicalStudy",
        iris = Set("http://schema.org/MedicalStudy"),
        label = "MedicalStudy",
        comment = """A medical study is an umbrella type covering all kinds of research studies relating to human medicine or health, including observational studies and interventional trials and registries, randomized, controlled or not. When the specific type of study is known, use one of the extensions of this type, such as MedicalTrial or MedicalObservationalStudy. Also, note that this type should be used to mark up data that describes the study itself; to tag an article that publishes the results of a study, use MedicalScholarlyArticle. Note: use the code property of MedicalEntity to store study IDs, e.g. clinicaltrials.gov ID.""",
        `@extends` = () => List(MedicalEntity.ontology)
       ){
object keys extends lspace.ns.vocab.schema.MedicalEntity.Properties{
lazy val studyLocation = lspace.ns.vocab.schema.studyLocation.property
lazy val healthCondition = lspace.ns.vocab.schema.healthCondition.property
lazy val outcome = lspace.ns.vocab.schema.outcome.property
}
override lazy val properties: List[LProperty] = List(studyLocation, healthCondition, outcome)
trait Properties extends lspace.ns.vocab.schema.MedicalEntity.Properties{
lazy val studyLocation = lspace.ns.vocab.schema.studyLocation.property
lazy val healthCondition = lspace.ns.vocab.schema.healthCondition.property
lazy val outcome = lspace.ns.vocab.schema.outcome.property
}
}