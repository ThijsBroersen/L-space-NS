package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object MedicalRiskCalculator extends OntologyDef(
        iri = "http://schema.org/MedicalRiskCalculator",
        iris = Set("http://schema.org/MedicalRiskCalculator"),
        label = "MedicalRiskCalculator",
        comment = """A complex mathematical calculation requiring an online calculator, used to assess prognosis. Note: use the url property of Thing to record any URLs for online calculators.""",
        `@extends` = List(MedicalRiskEstimator.ontology)
       ){
object keys extends lspace.ns.vocab.schema.MedicalRiskEstimator.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.MedicalRiskEstimator.Properties{

}
}