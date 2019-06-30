package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object itemReviewed extends PropertyDef(
        iri = "http://schema.org/itemReviewed",
        iris = Set("http://schema.org/itemReviewed"),
        label = "itemReviewed",
        comment = """The item that is being reviewed/rated.""",
        `@extends` = () => List(),
        `@range` = () => List(Thing.ontology)
       ){
}