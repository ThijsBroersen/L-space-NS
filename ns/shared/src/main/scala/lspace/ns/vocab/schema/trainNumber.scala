package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object trainNumber extends PropertyDef(
        iri = "http://schema.org/trainNumber",
        iris = Set("http://schema.org/trainNumber"),
        label = "trainNumber",
        comment = """The unique identifier for the train.""",
        `@extends` = List(),
        `@range` = List(`@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}