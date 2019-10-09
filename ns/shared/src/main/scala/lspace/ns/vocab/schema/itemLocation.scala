package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object itemLocation extends PropertyDef(
        iri = "http://schema.org/itemLocation",
        iris = Set("http://schema.org/itemLocation"),
        label = "itemLocation",
        comment = """Current location of the item.""",
        `@extends` = List(location.property),
        `@range` = List(PostalAddress.ontology, Place.ontology, `@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.location.Properties
}