package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object MedicalTest extends OntologyDef(
        iri = "http://schema.org/MedicalTest",
        iris = Set("http://schema.org/MedicalTest"),
        label = "MedicalTest",
        comment = """Any medical test, typically performed for diagnostic purposes.""",
        `@extends` = () => List(MedicalEntity.ontology)
       ){
}