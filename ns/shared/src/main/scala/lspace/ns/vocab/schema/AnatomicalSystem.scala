package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object AnatomicalSystem extends OntologyDef(
        iri = "http://schema.org/AnatomicalSystem",
        iris = Set("http://schema.org/AnatomicalSystem"),
        label = "AnatomicalSystem",
        comment = """An anatomical system is a group of anatomical structures that work together to perform a certain task. Anatomical systems, such as organ systems, are one organizing principle of anatomy, and can includes circulatory, digestive, endocrine, integumentary, immune, lymphatic, muscular, nervous, reproductive, respiratory, skeletal, urinary, vestibular, and other systems.""",
        `@extends` = () => List(MedicalEntity.ontology)
       ){
object keys extends lspace.ns.vocab.schema.MedicalEntity.Properties{
lazy val relatedStructure = lspace.ns.vocab.schema.relatedStructure.property
lazy val associatedPathophysiology = lspace.ns.vocab.schema.associatedPathophysiology.property
lazy val relatedTherapy = lspace.ns.vocab.schema.relatedTherapy.property
lazy val comprisedOf = lspace.ns.vocab.schema.comprisedOf.property
}
override lazy val properties: List[LProperty] = List(relatedStructure, associatedPathophysiology, relatedTherapy, comprisedOf)
trait Properties extends lspace.ns.vocab.schema.MedicalEntity.Properties{
lazy val relatedStructure = lspace.ns.vocab.schema.relatedStructure.property
lazy val associatedPathophysiology = lspace.ns.vocab.schema.associatedPathophysiology.property
lazy val relatedTherapy = lspace.ns.vocab.schema.relatedTherapy.property
lazy val comprisedOf = lspace.ns.vocab.schema.comprisedOf.property
}
}