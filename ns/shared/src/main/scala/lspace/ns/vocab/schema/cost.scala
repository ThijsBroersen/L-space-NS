package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object cost
    extends PropertyDef(
      iri = "http://schema.org/cost",
      iris = Set("http://schema.org/cost"),
      label = "cost",
      comment = """Cost per unit of the drug, as reported by the source being tagged.""",
      `@extends` = () => List(),
      `@range` = () => List(DrugCost.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
