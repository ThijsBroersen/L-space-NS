package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object MedicalTrialDesign extends OntologyDef(
        iri = "http://schema.org/MedicalTrialDesign",
        iris = Set("http://schema.org/MedicalTrialDesign"),
        label = "MedicalTrialDesign",
        comment = """Design models for medical trials. Enumerated type.""",
        `@extends` = () => List(Enumeration.ontology, MedicalEnumeration.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Enumeration.Properties with lspace.ns.vocab.schema.MedicalEnumeration.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.Enumeration.Properties with lspace.ns.vocab.schema.MedicalEnumeration.Properties{

}
}