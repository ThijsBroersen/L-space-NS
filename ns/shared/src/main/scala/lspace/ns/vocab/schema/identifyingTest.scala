package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object identifyingTest extends PropertyDef(
        iri = "http://schema.org/identifyingTest",
        iris = Set("http://schema.org/identifyingTest"),
        label = "identifyingTest",
        comment = """A diagnostic test that can identify this sign.""",
        `@extends` = () => List(),
        `@range` = () => List(MedicalTest.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}