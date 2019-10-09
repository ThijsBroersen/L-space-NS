package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object alternativeHeadline extends PropertyDef(
        iri = "http://schema.org/alternativeHeadline",
        iris = Set("http://schema.org/alternativeHeadline"),
        label = "alternativeHeadline",
        comment = """A secondary title of the CreativeWork.""",
        `@extends` = List(),
        `@range` = List(`@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}