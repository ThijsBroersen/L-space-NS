package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object MedicalSpecialty extends OntologyDef(
        iri = "http://schema.org/MedicalSpecialty",
        iris = Set("http://schema.org/MedicalSpecialty"),
        label = "MedicalSpecialty",
        comment = """Any specific branch of medical science or practice. Medical specialities include clinical specialties that pertain to particular organ systems and their respective disease states, as well as allied health specialties. Enumerated type.""",
        `@extends` = () => List(MedicalEnumeration.ontology, Specialty.ontology)
       ){
object keys extends lspace.ns.vocab.schema.MedicalEnumeration.Properties with lspace.ns.vocab.schema.Specialty.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.MedicalEnumeration.Properties with lspace.ns.vocab.schema.Specialty.Properties{

}
}