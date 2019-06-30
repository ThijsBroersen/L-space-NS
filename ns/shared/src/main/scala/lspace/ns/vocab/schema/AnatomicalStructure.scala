package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object AnatomicalStructure extends OntologyDef(
        iri = "http://schema.org/AnatomicalStructure",
        iris = Set("http://schema.org/AnatomicalStructure"),
        label = "AnatomicalStructure",
        comment = """Any part of the human body, typically a component of an anatomical system. Organs, tissues, and cells are all anatomical structures.""",
        `@extends` = () => List(MedicalEntity.ontology)
       ){
}