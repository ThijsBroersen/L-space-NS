package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object duns extends PropertyDef(
        iri = "https://schema.org/duns",
        iris = Set("https://schema.org/duns"),
        label = "duns",
        comment = """The Dun &amp; Bradstreet DUNS number for identifying an organization or business person.""",
        `@extends` = () => List(identifier),
        `@range` = () => List()
       ){

override lazy val properties: List[Property] = List()
trait Properties extends lspace.ns.vocab.schema.identifier.Properties
}