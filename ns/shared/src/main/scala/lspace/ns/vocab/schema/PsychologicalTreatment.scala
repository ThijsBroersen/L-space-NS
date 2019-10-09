package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object PsychologicalTreatment extends OntologyDef(
        iri = "http://schema.org/PsychologicalTreatment",
        iris = Set("http://schema.org/PsychologicalTreatment"),
        label = "PsychologicalTreatment",
        comment = """A process of care relying upon counseling, dialogue and communication  aimed at improving a mental health condition without use of drugs.""",
        `@extends` = List(TherapeuticProcedure.ontology)
       ){
object keys extends lspace.ns.vocab.schema.TherapeuticProcedure.Properties{

override lazy val indication = lspace.ns.vocab.schema.indication.property}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.TherapeuticProcedure.Properties{

override lazy val indication = lspace.ns.vocab.schema.indication.property}
}