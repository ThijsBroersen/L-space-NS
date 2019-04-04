package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object homeLocation extends PropertyDef(
        iri = "https://schema.org/homeLocation",
        iris = Set("https://schema.org/homeLocation"),
        label = "homeLocation",
        comment = """A contact location for a person's residence.""",
        `@extends` = () => List(location.property),
        `@range` = () => List()
       ){

override lazy val properties: List[Property] = List()
trait Properties extends lspace.ns.vocab.schema.location.Properties
}