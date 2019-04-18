package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object loanPaymentFrequency
    extends PropertyDef(
      iri = "http://schema.org/loanPaymentFrequency",
      iris = Set("http://schema.org/loanPaymentFrequency"),
      label = "loanPaymentFrequency",
      comment =
        """Frequency of payments due, i.e. number of months between payments. This is defined as a frequency, i.e. the reciprocal of a period of time.""",
      `@extends` = () => List(),
      `@range` = () => List(Number.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
