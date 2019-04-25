package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object RepaymentSpecification
    extends OntologyDef(
      iri = "http://schema.org/RepaymentSpecification",
      iris = Set("http://schema.org/RepaymentSpecification"),
      label = "RepaymentSpecification",
      comment = """A structured value representing repayment.""",
      `@extends` = () => List(StructuredValue.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.StructuredValue.Properties {}
  override lazy val properties: List[LProperty] = List()
  trait Properties extends lspace.ns.vocab.schema.StructuredValue.Properties {}
}
