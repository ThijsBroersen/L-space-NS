package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ExercisePlan extends OntologyDef(
        iri = "http://schema.org/ExercisePlan",
        iris = Set("http://schema.org/ExercisePlan"),
        label = "ExercisePlan",
        comment = """Fitness-related activity designed for a specific health-related purpose, including defined exercise routines as well as activity prescribed by a clinician.""",
        `@extends` = List(PhysicalActivity.ontology, CreativeWork.ontology)
       ){
object keys extends lspace.ns.vocab.schema.PhysicalActivity.Properties with lspace.ns.vocab.schema.CreativeWork.Properties{
lazy val activityDuration = lspace.ns.vocab.schema.activityDuration.property
lazy val activityFrequency = lspace.ns.vocab.schema.activityFrequency.property
lazy val additionalVariable = lspace.ns.vocab.schema.additionalVariable.property
lazy val exerciseType = lspace.ns.vocab.schema.exerciseType.property
lazy val intensity = lspace.ns.vocab.schema.intensity.property
lazy val repetitions = lspace.ns.vocab.schema.repetitions.property
lazy val restPeriods = lspace.ns.vocab.schema.restPeriods.property
lazy val workload = lspace.ns.vocab.schema.workload.property
}
override lazy val properties: List[LProperty] = List(activityDuration, activityFrequency, additionalVariable, exerciseType, intensity, repetitions, restPeriods, workload)
trait Properties extends lspace.ns.vocab.schema.PhysicalActivity.Properties with lspace.ns.vocab.schema.CreativeWork.Properties{
lazy val activityDuration = lspace.ns.vocab.schema.activityDuration.property
lazy val activityFrequency = lspace.ns.vocab.schema.activityFrequency.property
lazy val additionalVariable = lspace.ns.vocab.schema.additionalVariable.property
lazy val exerciseType = lspace.ns.vocab.schema.exerciseType.property
lazy val intensity = lspace.ns.vocab.schema.intensity.property
lazy val repetitions = lspace.ns.vocab.schema.repetitions.property
lazy val restPeriods = lspace.ns.vocab.schema.restPeriods.property
lazy val workload = lspace.ns.vocab.schema.workload.property
}
}