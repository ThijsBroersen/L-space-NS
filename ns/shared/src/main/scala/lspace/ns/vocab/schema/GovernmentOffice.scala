package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object GovernmentOffice extends OntologyDef(
        iri = "http://schema.org/GovernmentOffice",
        iris = Set("http://schema.org/GovernmentOffice"),
        label = "GovernmentOffice",
        comment = """A government office&#x2014;for example, an IRS or DMV office.""",
        `@extends` = () => List(LocalBusiness.ontology)
       ){
}