package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object TherapeuticProcedure extends OntologyDef(
        iri = "http://schema.org/TherapeuticProcedure",
        iris = Set("http://schema.org/TherapeuticProcedure"),
        label = "TherapeuticProcedure",
        comment = """A medical procedure intended primarily for therapeutic purposes, aimed at improving a health condition.""",
        `@extends` = List(MedicalProcedure.ontology)
       ){
object keys extends lspace.ns.vocab.schema.MedicalProcedure.Properties{
lazy val adverseOutcome = lspace.ns.vocab.schema.adverseOutcome.property
lazy val doseSchedule = lspace.ns.vocab.schema.doseSchedule.property
lazy val drug = lspace.ns.vocab.schema.drug.property
}
override lazy val properties: List[LProperty] = List(adverseOutcome, doseSchedule, drug)
trait Properties extends lspace.ns.vocab.schema.MedicalProcedure.Properties{
lazy val adverseOutcome = lspace.ns.vocab.schema.adverseOutcome.property
lazy val doseSchedule = lspace.ns.vocab.schema.doseSchedule.property
lazy val drug = lspace.ns.vocab.schema.drug.property
}
}