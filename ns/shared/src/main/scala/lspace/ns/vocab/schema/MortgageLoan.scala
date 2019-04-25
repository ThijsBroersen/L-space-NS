package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object MortgageLoan
    extends OntologyDef(
      iri = "http://schema.org/MortgageLoan",
      iris = Set("http://schema.org/MortgageLoan"),
      label = "MortgageLoan",
      comment =
        """A loan in which property or real estate is used as collateral. (A loan securitized against some real estate.)""",
      `@extends` = () => List(LoanOrCredit.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.LoanOrCredit.Properties {}
  override lazy val properties: List[LProperty] = List()
  trait Properties extends lspace.ns.vocab.schema.LoanOrCredit.Properties {}
}
