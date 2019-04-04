package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object sourceOrganization extends PropertyDef(
        iri = "https://schema.org/sourceOrganization",
        iris = Set("https://schema.org/sourceOrganization"),
        label = "sourceOrganization",
        comment = """The Organization on whose behalf the creator was working.""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}