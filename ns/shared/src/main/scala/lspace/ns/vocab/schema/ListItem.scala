package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ListItem
    extends OntologyDef(
      iri = "http://schema.org/ListItem",
      iris = Set("http://schema.org/ListItem"),
      label = "ListItem",
      comment = """An list item, e.g. a step in a checklist or how-to description.""",
      `@extends` = () => List(Intangible.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Intangible.Properties {
    lazy val item         = lspace.ns.vocab.schema.item.property
    lazy val previousItem = lspace.ns.vocab.schema.previousItem.property
  }
  override lazy val properties: List[LProperty] = List(item, previousItem)
  trait Properties extends lspace.ns.vocab.schema.Intangible.Properties {
    lazy val item         = lspace.ns.vocab.schema.item.property
    lazy val previousItem = lspace.ns.vocab.schema.previousItem.property
  }
}
