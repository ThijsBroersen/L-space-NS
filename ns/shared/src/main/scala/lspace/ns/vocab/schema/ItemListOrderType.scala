package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object ItemListOrderType
    extends OntologyDef(
      iri = "http://schema.org/ItemListOrderType",
      iris = Set("http://schema.org/ItemListOrderType"),
      label = "ItemListOrderType",
      comment = """Enumerated for values for itemListOrder for indicating how an ordered ItemList is organized.""",
      `@extends` = () => List(Enumeration.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Enumeration.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.Enumeration.Properties {}
}
