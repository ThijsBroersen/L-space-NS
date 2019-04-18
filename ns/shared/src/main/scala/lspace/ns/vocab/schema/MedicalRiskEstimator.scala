package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object MedicalRiskEstimator extends OntologyDef(
        iri = "http://schema.org/MedicalRiskEstimator",
        iris = Set("http://schema.org/MedicalRiskEstimator"),
        label = "MedicalRiskEstimator",
        comment = """Any rule set or interactive tool for estimating the risk of developing a complication or condition.""",
        `@extends` = () => List(MedicalEntity.ontology)
       ){
object keys extends lspace.ns.vocab.schema.MedicalEntity.Properties{
lazy val includedRiskFactor = lspace.ns.vocab.schema.includedRiskFactor.property
}
override lazy val properties: List[LProperty] = List(includedRiskFactor)
trait Properties extends lspace.ns.vocab.schema.MedicalEntity.Properties{
lazy val includedRiskFactor = lspace.ns.vocab.schema.includedRiskFactor.property
}
}