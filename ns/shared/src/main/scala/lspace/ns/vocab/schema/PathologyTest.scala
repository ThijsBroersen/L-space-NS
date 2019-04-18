package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object PathologyTest
    extends OntologyDef(
      iri = "http://schema.org/PathologyTest",
      iris = Set("http://schema.org/PathologyTest"),
      label = "PathologyTest",
      comment =
        """A medical test performed by a laboratory that typically involves examination of a tissue sample by a pathologist.""",
      `@extends` = () => List(MedicalTest.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.MedicalTest.Properties {
    lazy val tissueSample = lspace.ns.vocab.schema.tissueSample.property
  }
  override lazy val properties: List[Property] = List(tissueSample)
  trait Properties extends lspace.ns.vocab.schema.MedicalTest.Properties {
    lazy val tissueSample = lspace.ns.vocab.schema.tissueSample.property
  }
}
