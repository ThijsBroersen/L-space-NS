package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object PalliativeProcedure extends OntologyDef(
        iri = "http://schema.org/PalliativeProcedure",
        iris = Set("http://schema.org/PalliativeProcedure"),
        label = "PalliativeProcedure",
        comment = """A medical procedure intended primarily for palliative purposes, aimed at relieving the symptoms of an underlying health condition.""",
        `@extends` = () => List(MedicalTherapy.ontology, MedicalProcedure.ontology)
       ){
}