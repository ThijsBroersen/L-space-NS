package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object variantCover extends PropertyDef(
        iri = "http://schema.org/variantCover",
        iris = Set("http://schema.org/variantCover"),
        label = "variantCover",
        comment = """A description of the variant cover
    for the issue, if the issue is a variant printing. For example, "Bryan Hitch
    Variant Cover" or "2nd Printing Variant".""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}