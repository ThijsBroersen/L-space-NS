package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object AutomatedTeller extends OntologyDef(
        iri = "http://schema.org/AutomatedTeller",
        iris = Set("http://schema.org/AutomatedTeller"),
        label = "AutomatedTeller",
        comment = """ATM/cash machine.""",
        `@extends` = () => List(FinancialService.ontology)
       ){
}