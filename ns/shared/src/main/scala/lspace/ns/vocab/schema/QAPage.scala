package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object QAPage extends OntologyDef(
        iri = "http://schema.org/QAPage",
        iris = Set("http://schema.org/QAPage"),
        label = "QAPage",
        comment = """A QAPage is a WebPage focussed on a specific Question and its Answer(s), e.g. in a question answering site or documenting Frequently Asked Questions (FAQs).""",
        `@extends` = () => List(WebPage.ontology)
       ){
}