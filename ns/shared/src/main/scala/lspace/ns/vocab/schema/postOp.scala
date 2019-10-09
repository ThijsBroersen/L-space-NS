package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object postOp extends PropertyDef(
        iri = "http://schema.org/postOp",
        iris = Set("http://schema.org/postOp"),
        label = "postOp",
        comment = """A description of the postoperative procedures, care, and/or followups for this device.""",
        `@extends` = List(),
        `@range` = List(`@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}