package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object maxValue extends PropertyDef(
        iri = "http://schema.org/maxValue",
        iris = Set("http://schema.org/maxValue"),
        label = "maxValue",
        comment = """The upper value of some characteristic or property.""",
        `@extends` = () => List(),
        `@range` = () => List(`@number`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}