package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object strengthValue extends PropertyDef(
        iri = "http://schema.org/strengthValue",
        iris = Set("http://schema.org/strengthValue"),
        label = "strengthValue",
        comment = """The value of an active ingredient's strength, e.g. 325.""",
        `@extends` = List(),
        `@range` = List(`@number`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}