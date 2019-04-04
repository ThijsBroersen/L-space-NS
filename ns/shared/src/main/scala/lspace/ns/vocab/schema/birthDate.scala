package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object birthDate extends PropertyDef(
        iri = "https://schema.org/birthDate",
        iris = Set("https://schema.org/birthDate"),
        label = "birthDate",
        comment = """Date of birth.""",
        `@extends` = () => List(),
        `@range` = () => List(`@date`)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}