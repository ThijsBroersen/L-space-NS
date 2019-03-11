package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object familyName extends PropertyDef(
        iri = "https://schema.org/familyName",
        iris = Set("https://schema.org/familyName"),
        label = "familyName",
        comment = """Family name. In the U.S., the last name of an Person. This can be used along with givenName instead of the name property.""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}