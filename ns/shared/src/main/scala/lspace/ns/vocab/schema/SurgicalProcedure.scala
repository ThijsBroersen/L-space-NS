package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object SurgicalProcedure extends OntologyDef(
        iri = "http://schema.org/SurgicalProcedure",
        iris = Set("http://schema.org/SurgicalProcedure"),
        label = "SurgicalProcedure",
        comment = """A medical procedure involving an incision with instruments; performed for diagnose, or therapeutic purposes.""",
        `@extends` = () => List(MedicalProcedure.ontology)
       ){
}