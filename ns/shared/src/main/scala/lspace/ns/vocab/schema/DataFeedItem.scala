package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object DataFeedItem extends OntologyDef(
        iri = "http://schema.org/DataFeedItem",
        iris = Set("http://schema.org/DataFeedItem"),
        label = "DataFeedItem",
        comment = """A single item within a larger data feed.""",
        `@extends` = () => List(Intangible.ontology)
       ){
}