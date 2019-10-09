package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object modifiedTime extends PropertyDef(
        iri = "http://schema.org/modifiedTime",
        iris = Set("http://schema.org/modifiedTime"),
        label = "modifiedTime",
        comment = """The date and time the reservation was modified.""",
        `@extends` = List(),
        `@range` = List(`@datetime`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}