package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object accountMinimumInflow
    extends PropertyDef(
      iri = "http://schema.org/accountMinimumInflow",
      iris = Set("http://schema.org/accountMinimumInflow"),
      label = "accountMinimumInflow",
      comment = """A minimum amount that has to be paid in every month.""",
      `@extends` = () => List(),
      `@range` = () => List(MonetaryAmount.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
