package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ExercisePlan
    extends OntologyDef(
      iri = "http://schema.org/ExercisePlan",
      iris = Set("http://schema.org/ExercisePlan"),
      label = "ExercisePlan",
      comment =
        """Fitness-related activity designed for a specific health-related purpose, including defined exercise routines as well as activity prescribed by a clinician.""",
      `@extends` = () => List(PhysicalActivity.ontology, CreativeWork.ontology)
    ) {
  object keys
      extends lspace.ns.vocab.schema.PhysicalActivity.Properties
      with lspace.ns.vocab.schema.CreativeWork.Properties {
    lazy val workload         = lspace.ns.vocab.schema.workload.property
    lazy val intensity        = lspace.ns.vocab.schema.intensity.property
    lazy val restPeriods      = lspace.ns.vocab.schema.restPeriods.property
    lazy val activityDuration = lspace.ns.vocab.schema.activityDuration.property
  }
  override lazy val properties: List[LProperty] = List(workload, intensity, restPeriods, activityDuration)
  trait Properties
      extends lspace.ns.vocab.schema.PhysicalActivity.Properties
      with lspace.ns.vocab.schema.CreativeWork.Properties {
    lazy val workload         = lspace.ns.vocab.schema.workload.property
    lazy val intensity        = lspace.ns.vocab.schema.intensity.property
    lazy val restPeriods      = lspace.ns.vocab.schema.restPeriods.property
    lazy val activityDuration = lspace.ns.vocab.schema.activityDuration.property
  }
}
