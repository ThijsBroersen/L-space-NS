package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object MedicalCondition extends OntologyDef(
        iri = "http://schema.org/MedicalCondition",
        iris = Set("http://schema.org/MedicalCondition"),
        label = "MedicalCondition",
        comment = """Any condition of the human body that affects the normal functioning of a person, whether physically or mentally. Includes diseases, injuries, disabilities, disorders, syndromes, etc.""",
        `@extends` = () => List(MedicalEntity.ontology)
       ){
}