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
}