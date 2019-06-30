package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object LegalService extends OntologyDef(
        iri = "http://schema.org/LegalService",
        iris = Set("http://schema.org/LegalService"),
        label = "LegalService",
        comment = """A LegalService is a business that provides legally-oriented services, advice and representation, e.g. law firms.<br/><br/>

As a <a class="localLink" href="http://schema.org/LocalBusiness">LocalBusiness</a> it can be described as a <a class="localLink" href="http://schema.org/provider">provider</a> of one or more <a class="localLink" href="http://schema.org/Service">Service</a>(s).""",
        `@extends` = () => List(LocalBusiness.ontology)
       ){
}