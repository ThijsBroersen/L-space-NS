package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object incentiveCompensation extends PropertyDef(
        iri = "http://schema.org/incentiveCompensation",
        iris = Set("http://schema.org/incentiveCompensation"),
        label = "incentiveCompensation",
        comment = """Description of bonus and commission compensation aspects of the job.""",
        `@extends` = List(),
        `@range` = List(`@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}