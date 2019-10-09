package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object familyName extends PropertyDef(
        iri = "http://schema.org/familyName",
        iris = Set("http://schema.org/familyName"),
        label = "familyName",
        comment = """Family name. In the U.S., the last name of an Person. This can be used along with givenName instead of the name property.""",
        `@extends` = List(),
        `@range` = List(`@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}