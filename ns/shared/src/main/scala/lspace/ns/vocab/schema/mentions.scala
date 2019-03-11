package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object mentions extends PropertyDef(
        iri = "https://schema.org/mentions",
        iris = Set("https://schema.org/mentions"),
        label = "mentions",
        comment = """Indicates that the CreativeWork contains a reference to, but is not necessarily about a concept.""",
        `@extends` = () => List(),
        `@range` = () => List(Thing)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}