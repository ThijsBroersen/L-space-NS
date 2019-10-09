package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object preOp extends PropertyDef(
        iri = "http://schema.org/preOp",
        iris = Set("http://schema.org/preOp"),
        label = "preOp",
        comment = """A description of the workup, testing, and other preparations required before implanting this device.""",
        `@extends` = List(),
        `@range` = List(`@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}