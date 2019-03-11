package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object alternativeHeadline extends PropertyDef(
        iri = "https://schema.org/alternativeHeadline",
        iris = Set("https://schema.org/alternativeHeadline"),
        label = "alternativeHeadline",
        comment = """A secondary title of the CreativeWork.""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}