package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object MedicalDevice extends OntologyDef(
        iri = "http://schema.org/MedicalDevice",
        iris = Set("http://schema.org/MedicalDevice"),
        label = "MedicalDevice",
        comment = """Any object used in a medical capacity, such as to diagnose or treat a patient.""",
        `@extends` = () => List(MedicalEntity.ontology)
       ){
object keys extends lspace.ns.vocab.schema.MedicalEntity.Properties{
lazy val adverseOutcome = lspace.ns.vocab.schema.adverseOutcome.property
lazy val contraindication = lspace.ns.vocab.schema.contraindication.property
lazy val indication = lspace.ns.vocab.schema.indication.property
lazy val postOp = lspace.ns.vocab.schema.postOp.property
lazy val preOp = lspace.ns.vocab.schema.preOp.property
lazy val procedure = lspace.ns.vocab.schema.procedure.property
lazy val purpose = lspace.ns.vocab.schema.purpose.property
lazy val seriousAdverseOutcome = lspace.ns.vocab.schema.seriousAdverseOutcome.property
}
override lazy val properties: List[LProperty] = List(adverseOutcome, contraindication, indication, postOp, preOp, procedure, purpose, seriousAdverseOutcome)
trait Properties extends lspace.ns.vocab.schema.MedicalEntity.Properties{
lazy val adverseOutcome = lspace.ns.vocab.schema.adverseOutcome.property
lazy val contraindication = lspace.ns.vocab.schema.contraindication.property
lazy val indication = lspace.ns.vocab.schema.indication.property
lazy val postOp = lspace.ns.vocab.schema.postOp.property
lazy val preOp = lspace.ns.vocab.schema.preOp.property
lazy val procedure = lspace.ns.vocab.schema.procedure.property
lazy val purpose = lspace.ns.vocab.schema.purpose.property
lazy val seriousAdverseOutcome = lspace.ns.vocab.schema.seriousAdverseOutcome.property
}
}