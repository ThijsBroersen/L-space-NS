package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object HealthPlanNetwork extends OntologyDef(
        iri = "http://schema.org/HealthPlanNetwork",
        iris = Set("http://schema.org/HealthPlanNetwork"),
        label = "HealthPlanNetwork",
        comment = """A US-style health insurance plan network.""",
        `@extends` = () => List(Intangible.ontology)
       ){
}