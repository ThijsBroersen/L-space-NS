package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object loanMortgageMandateAmount
    extends PropertyDef(
      iri = "http://schema.org/loanMortgageMandateAmount",
      iris = Set("http://schema.org/loanMortgageMandateAmount"),
      label = "loanMortgageMandateAmount",
      comment = """Amount of mortgage mandate that can be converted into a proper mortgage at a later stage.""",
      `@extends` = () => List(),
      `@range` = () => List(MonetaryAmount.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
