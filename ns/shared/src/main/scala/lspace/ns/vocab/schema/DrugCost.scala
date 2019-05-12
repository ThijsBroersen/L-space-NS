package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object DrugCost
    extends OntologyDef(
      iri = "http://schema.org/DrugCost",
      iris = Set("http://schema.org/DrugCost"),
      label = "DrugCost",
      comment =
        """The cost per unit of a medical drug. Note that this type is not meant to represent the price in an offer of a drug for sale; see the Offer type for that. This type will typically be used to tag wholesale or average retail cost of a drug, or maximum reimbursable cost. Costs of medical drugs vary widely depending on how and where they are paid for, so while this type captures some of the variables, costs should be used with caution by consumers of this schema's markup.""",
      `@extends` = () => List(MedicalEnumeration.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.MedicalEnumeration.Properties {
    lazy val costOrigin = lspace.ns.vocab.schema.costOrigin.property
  }
  override lazy val properties: List[LProperty] = List(costOrigin)
  trait Properties extends lspace.ns.vocab.schema.MedicalEnumeration.Properties {
    lazy val costOrigin = lspace.ns.vocab.schema.costOrigin.property
  }
}