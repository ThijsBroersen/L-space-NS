package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ItemList extends OntologyDef(
        iri = "http://schema.org/ItemList",
        iris = Set("http://schema.org/ItemList"),
        label = "ItemList",
        comment = """A list of items of any sort&#x2014;for example, Top 10 Movies About Weathermen, or Top 100 Party Songs. Not to be confused with HTML lists, which are often used only for formatting.""",
        `@extends` = () => List(Intangible.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Intangible.Properties{
lazy val itemListElement = lspace.ns.vocab.schema.itemListElement.property
lazy val itemListOrder = lspace.ns.vocab.schema.itemListOrder.property
lazy val numberOfItems = lspace.ns.vocab.schema.numberOfItems.property
}
override lazy val properties: List[LProperty] = List(itemListElement, itemListOrder, numberOfItems)
trait Properties extends lspace.ns.vocab.schema.Intangible.Properties{
lazy val itemListElement = lspace.ns.vocab.schema.itemListElement.property
lazy val itemListOrder = lspace.ns.vocab.schema.itemListOrder.property
lazy val numberOfItems = lspace.ns.vocab.schema.numberOfItems.property
}
}