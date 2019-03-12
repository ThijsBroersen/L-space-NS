package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object isFamilyFriendly extends PropertyDef(
        iri = "https://schema.org/isFamilyFriendly",
        iris = Set("https://schema.org/isFamilyFriendly"),
        label = "isFamilyFriendly",
        comment = """Indicates whether this content is family friendly.""",
        `@extends` = () => List(),
        `@range` = () => List(`@boolean`)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}