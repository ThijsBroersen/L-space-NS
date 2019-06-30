package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object RadiationTherapy extends OntologyDef(
        iri = "http://schema.org/RadiationTherapy",
        iris = Set("http://schema.org/RadiationTherapy"),
        label = "RadiationTherapy",
        comment = """A process of care using radiation aimed at improving a health condition.""",
        `@extends` = () => List(MedicalTherapy.ontology)
       ){
}