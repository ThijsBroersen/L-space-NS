package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object givenName extends PropertyDef(
        iri = "https://schema.org/givenName",
        iris = Set("https://schema.org/givenName"),
        label = "givenName",
        comment = """Given name. In the U.S., the first name of a Person. This can be used along with familyName instead of the name property.""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}