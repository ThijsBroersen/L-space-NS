package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object TherapeuticProcedure extends OntologyDef(
        iri = "http://schema.org/TherapeuticProcedure",
        iris = Set("http://schema.org/TherapeuticProcedure"),
        label = "TherapeuticProcedure",
        comment = """A medical procedure intended primarily for therapeutic purposes, aimed at improving a health condition.""",
        `@extends` = () => List(MedicalProcedure.ontology)
       ){
}