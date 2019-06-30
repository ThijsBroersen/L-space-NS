package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object HealthInsurancePlan extends OntologyDef(
        iri = "http://schema.org/HealthInsurancePlan",
        iris = Set("http://schema.org/HealthInsurancePlan"),
        label = "HealthInsurancePlan",
        comment = """A US-style health insurance plan, including PPOs, EPOs, and HMOs.""",
        `@extends` = () => List(Intangible.ontology)
       ){
}