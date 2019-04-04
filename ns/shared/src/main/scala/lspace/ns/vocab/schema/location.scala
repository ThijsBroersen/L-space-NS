package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object location extends PropertyDef(
        iri = "https://schema.org/location",
        iris = Set("https://schema.org/location"),
        label = "location",
        comment = """The location of for example where the event is happening, an organization is located, or where an action takes place.""",
        `@extends` = () => List(),
        `@range` = () => List(PostalAddress.ontology, Place.ontology, `@string`)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}