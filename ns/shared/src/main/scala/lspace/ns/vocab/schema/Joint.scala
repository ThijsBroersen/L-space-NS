package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object Joint
    extends OntologyDef(
      iri = "http://schema.org/Joint",
      iris = Set("http://schema.org/Joint"),
      label = "Joint",
      comment = """The anatomical location at which two or more bones make contact.""",
      `@extends` = () => List(AnatomicalStructure.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.AnatomicalStructure.Properties {
    lazy val functionalClass   = lspace.ns.vocab.schema.functionalClass.property
    lazy val structuralClass   = lspace.ns.vocab.schema.structuralClass.property
    lazy val biomechnicalClass = lspace.ns.vocab.schema.biomechnicalClass.property
  }
  override lazy val properties: List[Property] = List(functionalClass, structuralClass, biomechnicalClass)
  trait Properties extends lspace.ns.vocab.schema.AnatomicalStructure.Properties {
    lazy val functionalClass   = lspace.ns.vocab.schema.functionalClass.property
    lazy val structuralClass   = lspace.ns.vocab.schema.structuralClass.property
    lazy val biomechnicalClass = lspace.ns.vocab.schema.biomechnicalClass.property
  }
}
