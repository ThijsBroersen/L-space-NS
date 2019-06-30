package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object MedicalEntity extends OntologyDef(
        iri = "http://schema.org/MedicalEntity",
        iris = Set("http://schema.org/MedicalEntity"),
        label = "MedicalEntity",
        comment = """The most generic type of entity related to health and the practice of medicine.""",
        `@extends` = () => List(Thing.ontology)
       ){
}