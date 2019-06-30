package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object InsuranceAgency extends OntologyDef(
        iri = "http://schema.org/InsuranceAgency",
        iris = Set("http://schema.org/InsuranceAgency"),
        label = "InsuranceAgency",
        comment = """An Insurance agency.""",
        `@extends` = () => List(FinancialService.ontology)
       ){
}