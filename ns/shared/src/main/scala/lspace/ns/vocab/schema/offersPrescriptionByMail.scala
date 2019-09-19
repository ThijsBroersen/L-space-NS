package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object offersPrescriptionByMail extends PropertyDef(
        iri = "http://schema.org/offersPrescriptionByMail",
        iris = Set("http://schema.org/offersPrescriptionByMail"),
        label = "offersPrescriptionByMail",
        comment = """Whether prescriptions can be delivered by mail.""",
        `@extends` = () => List(),
        `@range` = () => List(`@boolean`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}