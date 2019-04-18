package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object HowToSupply
    extends OntologyDef(
      iri = "http://schema.org/HowToSupply",
      iris = Set("http://schema.org/HowToSupply"),
      label = "HowToSupply",
      comment = """A supply consumed when performing the instructions for how to achieve a result.""",
      `@extends` = () => List(HowToItem.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.HowToItem.Properties {
    lazy val estimatedCost = lspace.ns.vocab.schema.estimatedCost.property
  }
  override lazy val properties: List[Property] = List(estimatedCost)
  trait Properties extends lspace.ns.vocab.schema.HowToItem.Properties {
    lazy val estimatedCost = lspace.ns.vocab.schema.estimatedCost.property
  }
}
