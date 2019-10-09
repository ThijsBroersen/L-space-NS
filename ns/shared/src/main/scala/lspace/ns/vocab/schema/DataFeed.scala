package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object DataFeed extends OntologyDef(
        iri = "http://schema.org/DataFeed",
        iris = Set("http://schema.org/DataFeed"),
        label = "DataFeed",
        comment = """A single feed providing structured information about one or more entities or topics.""",
        `@extends` = List(Dataset.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Dataset.Properties{
lazy val dataFeedElement = lspace.ns.vocab.schema.dataFeedElement.property
}
override lazy val properties: List[LProperty] = List(dataFeedElement)
trait Properties extends lspace.ns.vocab.schema.Dataset.Properties{
lazy val dataFeedElement = lspace.ns.vocab.schema.dataFeedElement.property
}
}