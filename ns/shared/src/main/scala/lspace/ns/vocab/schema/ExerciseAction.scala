package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ExerciseAction extends OntologyDef(
        iri = "http://schema.org/ExerciseAction",
        iris = Set("http://schema.org/ExerciseAction"),
        label = "ExerciseAction",
        comment = """The act of participating in exertive activity for the purposes of improving health and fitness.""",
        `@extends` = () => List(PlayAction.ontology)
       ){
object keys extends lspace.ns.vocab.schema.PlayAction.Properties{
lazy val exerciseCourse = lspace.ns.vocab.schema.exerciseCourse.property
lazy val sportsEvent = lspace.ns.vocab.schema.sportsEvent.property
lazy val exerciseRelatedDiet = lspace.ns.vocab.schema.exerciseRelatedDiet.property
lazy val sportsActivityLocation = lspace.ns.vocab.schema.sportsActivityLocation.property
lazy val distance = lspace.ns.vocab.schema.distance.property
lazy val exerciseType = lspace.ns.vocab.schema.exerciseType.property
lazy val course = lspace.ns.vocab.schema.course.property
lazy val toLocation = lspace.ns.vocab.schema.toLocation.property
lazy val exercisePlan = lspace.ns.vocab.schema.exercisePlan.property
lazy val opponent = lspace.ns.vocab.schema.opponent.property
lazy val diet = lspace.ns.vocab.schema.diet.property
lazy val fromLocation = lspace.ns.vocab.schema.fromLocation.property
lazy val sportsTeam = lspace.ns.vocab.schema.sportsTeam.property
}
override lazy val properties: List[LProperty] = List(exerciseCourse, sportsEvent, exerciseRelatedDiet, sportsActivityLocation, distance, exerciseType, course, toLocation, exercisePlan, opponent, diet, fromLocation, sportsTeam)
trait Properties extends lspace.ns.vocab.schema.PlayAction.Properties{
lazy val exerciseCourse = lspace.ns.vocab.schema.exerciseCourse.property
lazy val sportsEvent = lspace.ns.vocab.schema.sportsEvent.property
lazy val exerciseRelatedDiet = lspace.ns.vocab.schema.exerciseRelatedDiet.property
lazy val sportsActivityLocation = lspace.ns.vocab.schema.sportsActivityLocation.property
lazy val distance = lspace.ns.vocab.schema.distance.property
lazy val exerciseType = lspace.ns.vocab.schema.exerciseType.property
lazy val course = lspace.ns.vocab.schema.course.property
lazy val toLocation = lspace.ns.vocab.schema.toLocation.property
lazy val exercisePlan = lspace.ns.vocab.schema.exercisePlan.property
lazy val opponent = lspace.ns.vocab.schema.opponent.property
lazy val diet = lspace.ns.vocab.schema.diet.property
lazy val fromLocation = lspace.ns.vocab.schema.fromLocation.property
lazy val sportsTeam = lspace.ns.vocab.schema.sportsTeam.property
}
}