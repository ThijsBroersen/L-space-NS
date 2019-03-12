package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object email extends PropertyDef(
        iri = "https://schema.org/email",
        iris = Set("https://schema.org/email"),
        label = "email",
        comment = """Email address.""",
        `@extends` = () => List(),
        `@range` = () => List(`@string`)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}