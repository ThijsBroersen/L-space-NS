package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object contactPoints extends PropertyDef(
        iri = "https://schema.org/contactPoints",
        iris = Set("https://schema.org/contactPoints"),
        label = "contactPoints",
        comment = """A contact point for a person or organization.""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}