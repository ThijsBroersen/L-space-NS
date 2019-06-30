package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object FinancialService extends OntologyDef(
        iri = "http://schema.org/FinancialService",
        iris = Set("http://schema.org/FinancialService"),
        label = "FinancialService",
        comment = """Financial services business.""",
        `@extends` = () => List(LocalBusiness.ontology)
       ){
}