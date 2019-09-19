package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Invoice extends OntologyDef(
        iri = "http://schema.org/Invoice",
        iris = Set("http://schema.org/Invoice"),
        label = "Invoice",
        comment = """A statement of the money due for goods or services; a bill.""",
        `@extends` = () => List(Intangible.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Intangible.Properties{
lazy val accountId = lspace.ns.vocab.schema.accountId.property
lazy val billingPeriod = lspace.ns.vocab.schema.billingPeriod.property
lazy val broker = lspace.ns.vocab.schema.broker.property
lazy val category = lspace.ns.vocab.schema.category.property
lazy val confirmationNumber = lspace.ns.vocab.schema.confirmationNumber.property
lazy val customer = lspace.ns.vocab.schema.customer.property
lazy val minimumPaymentDue = lspace.ns.vocab.schema.minimumPaymentDue.property
lazy val paymentDueDate = lspace.ns.vocab.schema.paymentDueDate.property
lazy val paymentMethod = lspace.ns.vocab.schema.paymentMethod.property
lazy val paymentMethodId = lspace.ns.vocab.schema.paymentMethodId.property
lazy val paymentStatus = lspace.ns.vocab.schema.paymentStatus.property
lazy val provider = lspace.ns.vocab.schema.provider.property
lazy val referencesOrder = lspace.ns.vocab.schema.referencesOrder.property
lazy val scheduledPaymentDate = lspace.ns.vocab.schema.scheduledPaymentDate.property
lazy val totalPaymentDue = lspace.ns.vocab.schema.totalPaymentDue.property
}
override lazy val properties: List[LProperty] = List(accountId, billingPeriod, broker, category, confirmationNumber, customer, minimumPaymentDue, paymentDueDate, paymentMethod, paymentMethodId, paymentStatus, provider, referencesOrder, scheduledPaymentDate, totalPaymentDue)
trait Properties extends lspace.ns.vocab.schema.Intangible.Properties{
lazy val accountId = lspace.ns.vocab.schema.accountId.property
lazy val billingPeriod = lspace.ns.vocab.schema.billingPeriod.property
lazy val broker = lspace.ns.vocab.schema.broker.property
lazy val category = lspace.ns.vocab.schema.category.property
lazy val confirmationNumber = lspace.ns.vocab.schema.confirmationNumber.property
lazy val customer = lspace.ns.vocab.schema.customer.property
lazy val minimumPaymentDue = lspace.ns.vocab.schema.minimumPaymentDue.property
lazy val paymentDueDate = lspace.ns.vocab.schema.paymentDueDate.property
lazy val paymentMethod = lspace.ns.vocab.schema.paymentMethod.property
lazy val paymentMethodId = lspace.ns.vocab.schema.paymentMethodId.property
lazy val paymentStatus = lspace.ns.vocab.schema.paymentStatus.property
lazy val provider = lspace.ns.vocab.schema.provider.property
lazy val referencesOrder = lspace.ns.vocab.schema.referencesOrder.property
lazy val scheduledPaymentDate = lspace.ns.vocab.schema.scheduledPaymentDate.property
lazy val totalPaymentDue = lspace.ns.vocab.schema.totalPaymentDue.property
}
}