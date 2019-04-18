package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object CreditCard
    extends OntologyDef(
      iri = "http://schema.org/CreditCard",
      iris = Set("http://schema.org/CreditCard"),
      label = "CreditCard",
      comment =
        """A card payment method of a particular brand or name.  Used to mark up a particular payment method and/or the financial product/service that supplies the card account.<br/><br/>

Commonly used values:<br/><br/>

<ul>
<li>http://purl.org/goodrelations/v1#AmericanExpress</li>
<li>http://purl.org/goodrelations/v1#DinersClub</li>
<li>http://purl.org/goodrelations/v1#Discover</li>
<li>http://purl.org/goodrelations/v1#JCB</li>
<li>http://purl.org/goodrelations/v1#MasterCard</li>
<li>http://purl.org/goodrelations/v1#VISA</li>
</ul>
""",
      `@extends` = () => List(LoanOrCredit.ontology, PaymentCard.ontology)
    ) {
  object keys
      extends lspace.ns.vocab.schema.LoanOrCredit.Properties
      with lspace.ns.vocab.schema.PaymentCard.Properties {
    lazy val monthlyMinimumRepaymentAmount = lspace.ns.vocab.schema.monthlyMinimumRepaymentAmount.property
  }
  override lazy val properties: List[Property] = List(monthlyMinimumRepaymentAmount)
  trait Properties
      extends lspace.ns.vocab.schema.LoanOrCredit.Properties
      with lspace.ns.vocab.schema.PaymentCard.Properties {
    lazy val monthlyMinimumRepaymentAmount = lspace.ns.vocab.schema.monthlyMinimumRepaymentAmount.property
  }
}
