package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object Invoice
    extends OntologyDef(
      iri = "http://schema.org/Invoice",
      iris = Set("http://schema.org/Invoice"),
      label = "Invoice",
      comment = """A statement of the money due for goods or services; a bill.""",
      `@extends` = () => List(Intangible.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Intangible.Properties {
    lazy val paymentDueDate  = lspace.ns.vocab.schema.paymentDueDate.property
    lazy val referencesOrder = lspace.ns.vocab.schema.referencesOrder.property
  }
  override lazy val properties: List[Property] = List(paymentDueDate, referencesOrder)
  trait Properties extends lspace.ns.vocab.schema.Intangible.Properties {
    lazy val paymentDueDate  = lspace.ns.vocab.schema.paymentDueDate.property
    lazy val referencesOrder = lspace.ns.vocab.schema.referencesOrder.property
  }
}
