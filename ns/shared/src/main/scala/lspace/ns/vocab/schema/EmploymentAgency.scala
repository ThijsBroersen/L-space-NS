package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object EmploymentAgency extends OntologyDef(
        iri = "http://schema.org/EmploymentAgency",
        iris = Set("http://schema.org/EmploymentAgency"),
        label = "EmploymentAgency",
        comment = """An employment agency.""",
        `@extends` = () => List(LocalBusiness.ontology)
       ){
}