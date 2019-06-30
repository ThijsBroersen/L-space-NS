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
}