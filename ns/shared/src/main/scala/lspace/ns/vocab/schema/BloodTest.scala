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
object keys extends lspace.ns.vocab.schema.MedicalTest.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.MedicalTest.Properties{

}
}