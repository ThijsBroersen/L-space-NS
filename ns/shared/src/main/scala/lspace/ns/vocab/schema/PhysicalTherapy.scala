package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object PhysicalTherapy extends OntologyDef(
        iri = "http://schema.org/PhysicalTherapy",
        iris = Set("http://schema.org/PhysicalTherapy"),
        label = "PhysicalTherapy",
        comment = """A process of progressive physical care and rehabilitation aimed at improving a health condition.""",
        `@extends` = () => List(MedicalTherapy.ontology)
       ){
}