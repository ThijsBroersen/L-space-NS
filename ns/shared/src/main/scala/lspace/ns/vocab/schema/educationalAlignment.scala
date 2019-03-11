package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object educationalAlignment extends PropertyDef(
        iri = "https://schema.org/educationalAlignment",
        iris = Set("https://schema.org/educationalAlignment"),
        label = "educationalAlignment",
        comment = """An alignment to an established educational framework.""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}