package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object dataFeedElement
    extends PropertyDef(
      iri = "http://schema.org/dataFeedElement",
      iris = Set("http://schema.org/dataFeedElement"),
      label = "dataFeedElement",
      comment = """An item within in a data feed. Data feeds may have many elements.""",
      `@extends` = () => List(),
      `@range` = () => List(DataFeedItem.ontology, Thing.ontology, Text.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
