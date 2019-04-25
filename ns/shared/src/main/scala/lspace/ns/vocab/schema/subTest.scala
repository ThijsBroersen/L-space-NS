package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object subTest
    extends PropertyDef(
      iri = "http://schema.org/subTest",
      iris = Set("http://schema.org/subTest"),
      label = "subTest",
      comment = """A component test of the panel.""",
      `@extends` = () => List(),
      `@range` = () => List(MedicalTest.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
