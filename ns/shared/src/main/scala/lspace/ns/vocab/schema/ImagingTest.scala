package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ImagingTest extends OntologyDef(
        iri = "http://schema.org/ImagingTest",
        iris = Set("http://schema.org/ImagingTest"),
        label = "ImagingTest",
        comment = """Any medical imaging modality typically used for diagnostic purposes.""",
        `@extends` = () => List(MedicalTest.ontology)
       ){
}