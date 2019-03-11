package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object educationalUse extends PropertyDef(
        iri = "https://schema.org/educationalUse",
        iris = Set("https://schema.org/educationalUse"),
        label = "educationalUse",
        comment = """The purpose of a work in the context of education; for example, 'assignment', 'group work'.""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}