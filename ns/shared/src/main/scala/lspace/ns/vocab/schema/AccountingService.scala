package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object AccountingService extends OntologyDef(
        iri = "http://schema.org/AccountingService",
        iris = Set("http://schema.org/AccountingService"),
        label = "AccountingService",
        comment = """Accountancy business.<br/><br/>

As a <a class="localLink" href="http://schema.org/LocalBusiness">LocalBusiness</a> it can be described as a <a class="localLink" href="http://schema.org/provider">provider</a> of one or more <a class="localLink" href="http://schema.org/Service">Service</a>(s).""",
        `@extends` = () => List(FinancialService.ontology)
       ){
}