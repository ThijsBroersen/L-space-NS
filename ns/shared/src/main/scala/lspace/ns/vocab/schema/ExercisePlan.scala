package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ExercisePlan extends OntologyDef(
        iri = "http://schema.org/ExercisePlan",
        iris = Set("http://schema.org/ExercisePlan"),
        label = "ExercisePlan",
        comment = """Fitness-related activity designed for a specific health-related purpose, including defined exercise routines as well as activity prescribed by a clinician.""",
        `@extends` = () => List(PhysicalActivity.ontology, CreativeWork.ontology)
       ){
}