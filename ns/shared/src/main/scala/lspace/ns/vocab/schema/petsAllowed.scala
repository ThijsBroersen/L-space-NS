package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object petsAllowed extends PropertyDef(
        iri = "http://schema.org/petsAllowed",
        iris = Set("http://schema.org/petsAllowed"),
        label = "petsAllowed",
        comment = """Indicates whether pets are allowed to enter the accommodation or lodging business. More detailed information can be put in a text value.""",
        `@extends` = List(),
        `@range` = List(`@boolean`, `@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}