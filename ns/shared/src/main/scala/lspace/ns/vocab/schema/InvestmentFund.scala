package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object InvestmentFund
    extends OntologyDef(
      iri = "http://schema.org/InvestmentFund",
      iris = Set("http://schema.org/InvestmentFund"),
      label = "InvestmentFund",
      comment =
        """A company or fund that gathers capital from a number of investors to create a pool of money that is then re-invested into stocks, bonds and other assets.""",
      `@extends` = () => List(InvestmentOrDeposit.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.InvestmentOrDeposit.Properties {}
  override lazy val properties: List[LProperty] = List()
  trait Properties extends lspace.ns.vocab.schema.InvestmentOrDeposit.Properties {}
}
