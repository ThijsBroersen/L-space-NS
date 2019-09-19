package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Patient extends OntologyDef(
        iri = "http://schema.org/Patient",
        iris = Set("http://schema.org/Patient"),
        label = "Patient",
        comment = """A patient is any person recipient of health care services.""",
        `@extends` = () => List(Person.ontology, MedicalAudience.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Person.Properties with lspace.ns.vocab.schema.MedicalAudience.Properties{
lazy val diagnosis = lspace.ns.vocab.schema.diagnosis.property
lazy val drug = lspace.ns.vocab.schema.drug.property
}
override lazy val properties: List[LProperty] = List(diagnosis, drug)
trait Properties extends lspace.ns.vocab.schema.Person.Properties with lspace.ns.vocab.schema.MedicalAudience.Properties{
lazy val diagnosis = lspace.ns.vocab.schema.diagnosis.property
lazy val drug = lspace.ns.vocab.schema.drug.property
}
}