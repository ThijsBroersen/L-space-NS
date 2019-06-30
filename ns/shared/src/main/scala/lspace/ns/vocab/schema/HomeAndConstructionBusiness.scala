package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object HomeAndConstructionBusiness extends OntologyDef(
        iri = "http://schema.org/HomeAndConstructionBusiness",
        iris = Set("http://schema.org/HomeAndConstructionBusiness"),
        label = "HomeAndConstructionBusiness",
        comment = """A construction business.<br/><br/>

A HomeAndConstructionBusiness is a <a class="localLink" href="http://schema.org/LocalBusiness">LocalBusiness</a> that provides services around homes and buildings.<br/><br/>

As a <a class="localLink" href="http://schema.org/LocalBusiness">LocalBusiness</a> it can be described as a <a class="localLink" href="http://schema.org/provider">provider</a> of one or more <a class="localLink" href="http://schema.org/Service">Service</a>(s).""",
        `@extends` = () => List(LocalBusiness.ontology)
       ){
}