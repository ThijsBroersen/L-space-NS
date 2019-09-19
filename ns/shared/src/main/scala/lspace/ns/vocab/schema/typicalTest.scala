package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object typicalTest extends PropertyDef(
        iri = "http://schema.org/typicalTest",
        iris = Set("http://schema.org/typicalTest"),
        label = "typicalTest",
        comment = """A medical test typically performed given this condition.""",
        `@extends` = () => List(),
        `@range` = () => List(MedicalTest.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}