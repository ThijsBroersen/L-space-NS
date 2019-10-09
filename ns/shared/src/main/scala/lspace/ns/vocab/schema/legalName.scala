package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object legalName extends PropertyDef(
        iri = "http://schema.org/legalName",
        iris = Set("http://schema.org/legalName"),
        label = "legalName",
        comment = """The official name of the organization, e.g. the registered company name.""",
        `@extends` = List(),
        `@range` = List(`@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}