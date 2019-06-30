package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object DataFeed extends OntologyDef(
        iri = "http://schema.org/DataFeed",
        iris = Set("http://schema.org/DataFeed"),
        label = "DataFeed",
        comment = """A single feed providing structured information about one or more entities or topics.""",
        `@extends` = () => List(Dataset.ontology)
       ){
}