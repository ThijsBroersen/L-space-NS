package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object itemListElement
    extends PropertyDef(
      iri = "http://schema.org/itemListElement",
      iris = Set("http://schema.org/itemListElement"),
      label = "itemListElement",
      comment =
        """For itemListElement values, you can use simple strings (e.g. "Peter", "Paul", "Mary"), existing entities, or use ListItem.<br/><br/>

Text values are best if the elements in the list are plain strings. Existing entities are best for a simple, unordered list of existing things in your data. ListItem is used with ordered lists when you want to provide additional context about the element in that list or when the same item might be in different places in different lists.<br/><br/>

Note: The order of elements in your mark-up is not sufficient for indicating the order or elements.  Use ListItem with a 'position' property in such cases.""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology, Thing.ontology, ListItem.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
