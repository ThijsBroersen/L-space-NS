package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ExerciseGym extends OntologyDef(
        iri = "http://schema.org/ExerciseGym",
        iris = Set("http://schema.org/ExerciseGym"),
        label = "ExerciseGym",
        comment = """A gym.""",
        `@extends` = () => List(SportsActivityLocation.ontology)
       ){
}