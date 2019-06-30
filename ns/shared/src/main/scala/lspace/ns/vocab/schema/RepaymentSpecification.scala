package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object RepaymentSpecification extends OntologyDef(
        iri = "http://schema.org/RepaymentSpecification",
        iris = Set("http://schema.org/RepaymentSpecification"),
        label = "RepaymentSpecification",
        comment = """A structured value representing repayment.""",
        `@extends` = () => List(StructuredValue.ontology)
       ){
}