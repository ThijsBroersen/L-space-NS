package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object AnatomicalStructure
    extends OntologyDef(
      iri = "http://schema.org/AnatomicalStructure",
      iris = Set("http://schema.org/AnatomicalStructure"),
      label = "AnatomicalStructure",
      comment =
        """Any part of the human body, typically a component of an anatomical system. Organs, tissues, and cells are all anatomical structures.""",
      `@extends` = () => List(MedicalEntity.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.MedicalEntity.Properties {
    lazy val partOfSystem = lspace.ns.vocab.schema.partOfSystem.property
    lazy val subStructure = lspace.ns.vocab.schema.subStructure.property
    lazy val bodyLocation = lspace.ns.vocab.schema.bodyLocation.property
    lazy val diagram      = lspace.ns.vocab.schema.diagram.property
  }
  override lazy val properties: List[Property] = List(partOfSystem, subStructure, bodyLocation, diagram)
  trait Properties extends lspace.ns.vocab.schema.MedicalEntity.Properties {
    lazy val partOfSystem = lspace.ns.vocab.schema.partOfSystem.property
    lazy val subStructure = lspace.ns.vocab.schema.subStructure.property
    lazy val bodyLocation = lspace.ns.vocab.schema.bodyLocation.property
    lazy val diagram      = lspace.ns.vocab.schema.diagram.property
  }
}
