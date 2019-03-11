package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object relatedTo extends PropertyDef(
        iri = "https://schema.org/relatedTo",
        iris = Set("https://schema.org/relatedTo"),
        label = "relatedTo",
        comment = """The most generic familial relation.""",
        `@extends` = () => List(),
        `@range` = () => List(Person)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}