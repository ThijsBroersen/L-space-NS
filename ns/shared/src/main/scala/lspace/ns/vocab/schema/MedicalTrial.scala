package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object MedicalTrial extends OntologyDef(
        iri = "http://schema.org/MedicalTrial",
        iris = Set("http://schema.org/MedicalTrial"),
        label = "MedicalTrial",
        comment = """A medical trial is a type of medical study that uses scientific process used to compare the safety and efficacy of medical therapies or medical procedures. In general, medical trials are controlled and subjects are allocated at random to the different treatment and/or control groups.""",
        `@extends` = () => List(MedicalStudy.ontology)
       ){
}