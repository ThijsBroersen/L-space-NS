package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object educationalUse extends PropertyDef(
        iri = "http://schema.org/educationalUse",
        iris = Set("http://schema.org/educationalUse"),
        label = "educationalUse",
        comment = """The purpose of a work in the context of education; for example, 'assignment', 'group work'.""",
        `@extends` = List(),
        `@range` = List(`@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}