package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object MedicalTestPanel extends OntologyDef(
        iri = "http://schema.org/MedicalTestPanel",
        iris = Set("http://schema.org/MedicalTestPanel"),
        label = "MedicalTestPanel",
        comment = """Any collection of tests commonly ordered together.""",
        `@extends` = () => List(MedicalTest.ontology)
       ){
object keys extends lspace.ns.vocab.schema.MedicalTest.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.MedicalTest.Properties{

}
}