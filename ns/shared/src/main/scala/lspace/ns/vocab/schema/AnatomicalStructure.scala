package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object AnatomicalStructure extends OntologyDef(
        iri = "http://schema.org/AnatomicalStructure",
        iris = Set("http://schema.org/AnatomicalStructure"),
        label = "AnatomicalStructure",
        comment = """Any part of the human body, typically a component of an anatomical system. Organs, tissues, and cells are all anatomical structures.""",
        `@extends` = List(MedicalEntity.ontology)
       ){
object keys extends lspace.ns.vocab.schema.MedicalEntity.Properties{
lazy val associatedPathophysiology = lspace.ns.vocab.schema.associatedPathophysiology.property
lazy val bodyLocation = lspace.ns.vocab.schema.bodyLocation.property
lazy val connectedTo = lspace.ns.vocab.schema.connectedTo.property
lazy val diagram = lspace.ns.vocab.schema.diagram.property
lazy val function = lspace.ns.vocab.schema.function.property
lazy val partOfSystem = lspace.ns.vocab.schema.partOfSystem.property
lazy val relatedCondition = lspace.ns.vocab.schema.relatedCondition.property
lazy val relatedTherapy = lspace.ns.vocab.schema.relatedTherapy.property
lazy val subStructure = lspace.ns.vocab.schema.subStructure.property
}
override lazy val properties: List[LProperty] = List(associatedPathophysiology, bodyLocation, connectedTo, diagram, function, partOfSystem, relatedCondition, relatedTherapy, subStructure)
trait Properties extends lspace.ns.vocab.schema.MedicalEntity.Properties{
lazy val associatedPathophysiology = lspace.ns.vocab.schema.associatedPathophysiology.property
lazy val bodyLocation = lspace.ns.vocab.schema.bodyLocation.property
lazy val connectedTo = lspace.ns.vocab.schema.connectedTo.property
lazy val diagram = lspace.ns.vocab.schema.diagram.property
lazy val function = lspace.ns.vocab.schema.function.property
lazy val partOfSystem = lspace.ns.vocab.schema.partOfSystem.property
lazy val relatedCondition = lspace.ns.vocab.schema.relatedCondition.property
lazy val relatedTherapy = lspace.ns.vocab.schema.relatedTherapy.property
lazy val subStructure = lspace.ns.vocab.schema.subStructure.property
}
}