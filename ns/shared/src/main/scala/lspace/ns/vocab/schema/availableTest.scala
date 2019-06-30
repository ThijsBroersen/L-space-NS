package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object availableTest extends PropertyDef(
        iri = "http://schema.org/availableTest",
        iris = Set("http://schema.org/availableTest"),
        label = "availableTest",
        comment = """A diagnostic test or procedure offered by this lab.""",
        `@extends` = () => List(),
        `@range` = () => List(MedicalTest.ontology)
       ){
}