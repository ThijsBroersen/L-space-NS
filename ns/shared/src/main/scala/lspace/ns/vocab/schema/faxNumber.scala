package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object faxNumber extends PropertyDef(
        iri = "http://schema.org/faxNumber",
        iris = Set("http://schema.org/faxNumber"),
        label = "faxNumber",
        comment = """The fax number.""",
        `@extends` = List(),
        `@range` = List(`@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}