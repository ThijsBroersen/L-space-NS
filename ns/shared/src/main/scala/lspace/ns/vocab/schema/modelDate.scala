package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object modelDate extends PropertyDef(
        iri = "http://schema.org/modelDate",
        iris = Set("http://schema.org/modelDate"),
        label = "modelDate",
        comment = """The release date of a vehicle model (often used to differentiate versions of the same make and model).""",
        `@extends` = List(),
        `@range` = List(`@date`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}