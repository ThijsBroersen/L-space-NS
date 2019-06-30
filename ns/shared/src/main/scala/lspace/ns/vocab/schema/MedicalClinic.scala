package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object MedicalClinic extends OntologyDef(
        iri = "http://schema.org/MedicalClinic",
        iris = Set("http://schema.org/MedicalClinic"),
        label = "MedicalClinic",
        comment = """A facility, often associated with a hospital or medical school, that is devoted to the specific diagnosis and/or healthcare. Previously limited to outpatients but with evolution it may be open to inpatients as well.""",
        `@extends` = () => List(MedicalOrganization.ontology, MedicalBusiness.ontology)
       ){
}