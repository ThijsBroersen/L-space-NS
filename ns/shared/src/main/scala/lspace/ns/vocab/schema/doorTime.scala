package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object doorTime extends PropertyDef(
        iri = "http://schema.org/doorTime",
        iris = Set("http://schema.org/doorTime"),
        label = "doorTime",
        comment = """The time admission will commence.""",
        `@extends` = () => List(),
        `@range` = () => List(`@datetime`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}