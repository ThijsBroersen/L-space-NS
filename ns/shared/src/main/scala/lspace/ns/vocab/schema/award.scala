package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object award extends PropertyDef(
        iri = "https://schema.org/award",
        iris = Set("https://schema.org/award"),
        label = "award",
        comment = """An award won by or for this item.""",
        `@extends` = () => List(),
        `@range` = () => List(`@string`)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}