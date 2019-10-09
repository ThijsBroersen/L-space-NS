package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object codeValue extends PropertyDef(
        iri = "http://schema.org/codeValue",
        iris = Set("http://schema.org/codeValue"),
        label = "codeValue",
        comment = """A short textual code that uniquely identifies the value.""",
        `@extends` = List(termCode.property),
        `@range` = List(`@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.termCode.Properties
}