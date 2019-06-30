package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object itinerary extends PropertyDef(
        iri = "http://schema.org/itinerary",
        iris = Set("http://schema.org/itinerary"),
        label = "itinerary",
        comment = """Destination(s) ( <a class="localLink" href="http://schema.org/Place">Place</a> ) that make up a trip. For a trip where destination order is important use <a class="localLink" href="http://schema.org/ItemList">ItemList</a> to specify that order (see examples).""",
        `@extends` = () => List(),
        `@range` = () => List(ItemList.ontology)
       ){
}