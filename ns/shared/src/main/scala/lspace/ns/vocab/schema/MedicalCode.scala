package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object MedicalCode
    extends OntologyDef(
      iri = "http://schema.org/MedicalCode",
      iris = Set("http://schema.org/MedicalCode"),
      label = "MedicalCode",
      comment = """A code for a medical entity.""",
      `@extends` = () => List(MedicalIntangible.ontology, CategoryCode.ontology)
    ) {
  object keys
      extends lspace.ns.vocab.schema.MedicalIntangible.Properties
      with lspace.ns.vocab.schema.CategoryCode.Properties {
    lazy val codingSystem = lspace.ns.vocab.schema.codingSystem.property
  }
  override lazy val properties: List[Property] = List(codingSystem)
  trait Properties
      extends lspace.ns.vocab.schema.MedicalIntangible.Properties
      with lspace.ns.vocab.schema.CategoryCode.Properties {
    lazy val codingSystem = lspace.ns.vocab.schema.codingSystem.property
  }
}
