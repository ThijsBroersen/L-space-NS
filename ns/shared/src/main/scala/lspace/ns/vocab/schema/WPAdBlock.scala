package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object WPAdBlock extends OntologyDef(
        iri = "http://schema.org/WPAdBlock",
        iris = Set("http://schema.org/WPAdBlock"),
        label = "WPAdBlock",
        comment = """An advertising section of the page.""",
        `@extends` = () => List(WebPageElement.ontology)
       ){
}