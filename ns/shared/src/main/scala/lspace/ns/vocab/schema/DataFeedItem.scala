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
object keys extends lspace.ns.vocab.schema.Intangible.Properties{
lazy val item = lspace.ns.vocab.schema.item.property
lazy val dateCreated = lspace.ns.vocab.schema.dateCreated.property
lazy val dateDeleted = lspace.ns.vocab.schema.dateDeleted.property
lazy val dateModified = lspace.ns.vocab.schema.dateModified.property
}
override lazy val properties: List[LProperty] = List(item, dateCreated, dateDeleted, dateModified)
trait Properties extends lspace.ns.vocab.schema.Intangible.Properties{
lazy val item = lspace.ns.vocab.schema.item.property
lazy val dateCreated = lspace.ns.vocab.schema.dateCreated.property
lazy val dateDeleted = lspace.ns.vocab.schema.dateDeleted.property
lazy val dateModified = lspace.ns.vocab.schema.dateModified.property
}
}