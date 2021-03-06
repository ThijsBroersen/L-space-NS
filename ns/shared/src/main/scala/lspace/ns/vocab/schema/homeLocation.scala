package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object homeLocation extends PropertyDef(
        iri = "http://schema.org/homeLocation",
        iris = Set("http://schema.org/homeLocation"),
        label = "homeLocation",
        comment = """A contact location for a person's residence.""",
        `@extends` = List(location.property),
        `@range` = List(ContactPoint.ontology, Place.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.location.Properties
}