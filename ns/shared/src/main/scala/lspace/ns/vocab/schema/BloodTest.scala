package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object BloodTest extends OntologyDef(
        iri = "http://schema.org/BloodTest",
        iris = Set("http://schema.org/BloodTest"),
        label = "BloodTest",
        comment = """A medical test performed on a sample of a patient's blood.""",
        `@extends` = () => List(MedicalTest.ontology)
       ){
}