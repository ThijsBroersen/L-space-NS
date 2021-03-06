package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object award extends PropertyDef(
        iri = "http://schema.org/award",
        iris = Set("http://schema.org/award"),
        label = "award",
        comment = """An award won by or for this item.""",
        `@extends` = List(),
        `@range` = List(`@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}