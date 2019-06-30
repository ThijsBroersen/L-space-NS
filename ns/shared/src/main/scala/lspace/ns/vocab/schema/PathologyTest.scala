package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object PathologyTest extends OntologyDef(
        iri = "http://schema.org/PathologyTest",
        iris = Set("http://schema.org/PathologyTest"),
        label = "PathologyTest",
        comment = """A medical test performed by a laboratory that typically involves examination of a tissue sample by a pathologist.""",
        `@extends` = () => List(MedicalTest.ontology)
       ){
}