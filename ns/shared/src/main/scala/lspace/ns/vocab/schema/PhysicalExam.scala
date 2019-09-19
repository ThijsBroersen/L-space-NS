package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object PhysicalExam extends OntologyDef(
        iri = "http://schema.org/PhysicalExam",
        iris = Set("http://schema.org/PhysicalExam"),
        label = "PhysicalExam",
        comment = """A type of physical examination of a patient performed by a physician.""",
        `@extends` = () => List(MedicalProcedure.ontology, MedicalEnumeration.ontology)
       ){
object keys extends lspace.ns.vocab.schema.MedicalProcedure.Properties with lspace.ns.vocab.schema.MedicalEnumeration.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.MedicalProcedure.Properties with lspace.ns.vocab.schema.MedicalEnumeration.Properties{

}
}