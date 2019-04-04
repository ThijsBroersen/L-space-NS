package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object contactPoint extends PropertyDef(
        iri = "https://schema.org/contactPoint",
        iris = Set("https://schema.org/contactPoint"),
        label = "contactPoint",
        comment = """A contact point for a person or organization.""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}