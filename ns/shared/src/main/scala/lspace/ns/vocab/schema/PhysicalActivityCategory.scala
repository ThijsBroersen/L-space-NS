package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object PhysicalActivityCategory
    extends OntologyDef(
      iri = "http://schema.org/PhysicalActivityCategory",
      iris = Set("http://schema.org/PhysicalActivityCategory"),
      label = "PhysicalActivityCategory",
      comment = """Categories of physical activity, organized by physiologic classification.""",
      `@extends` = () => List(Enumeration.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Enumeration.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.Enumeration.Properties {}
}
