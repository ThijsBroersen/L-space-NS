package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object typicalAgeRange extends PropertyDef(
        iri = "http://schema.org/typicalAgeRange",
        iris = Set("http://schema.org/typicalAgeRange"),
        label = "typicalAgeRange",
        comment = """The typical expected age range, e.g. '7-9', '11-'.""",
        `@extends` = List(),
        `@range` = List(`@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}