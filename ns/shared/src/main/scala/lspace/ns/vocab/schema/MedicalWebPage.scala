package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object MedicalWebPage extends OntologyDef(
        iri = "http://schema.org/MedicalWebPage",
        iris = Set("http://schema.org/MedicalWebPage"),
        label = "MedicalWebPage",
        comment = """A web page that provides medical information.""",
        `@extends` = () => List(WebPage.ontology)
       ){
}