package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object seriousAdverseOutcome
    extends PropertyDef(
      iri = "http://schema.org/seriousAdverseOutcome",
      iris = Set("http://schema.org/seriousAdverseOutcome"),
      label = "seriousAdverseOutcome",
      comment =
        """A possible serious complication and/or serious side effect of this therapy. Serious adverse outcomes include those that are life-threatening; result in death, disability, or permanent damage; require hospitalization or prolong existing hospitalization; cause congenital anomalies or birth defects; or jeopardize the patient and may require medical or surgical intervention to prevent one of the outcomes in this definition.""",
      `@extends` = () => List(),
      `@range` = () => List(MedicalEntity.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
