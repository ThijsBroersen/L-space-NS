package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object strengthUnit extends PropertyDef(
        iri = "http://schema.org/strengthUnit",
        iris = Set("http://schema.org/strengthUnit"),
        label = "strengthUnit",
        comment = """The units of an active ingredient's strength, e.g. mg.""",
        `@extends` = List(),
        `@range` = List(`@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}