package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object birthDate extends PropertyDef(
        iri = "http://schema.org/birthDate",
        iris = Set("http://schema.org/birthDate"),
        label = "birthDate",
        comment = """Date of birth.""",
        `@extends` = List(),
        `@range` = List(`@date`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}