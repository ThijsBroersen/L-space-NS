package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object wheelbase extends PropertyDef(
        iri = "http://schema.org/wheelbase",
        iris = Set("http://schema.org/wheelbase"),
        label = "wheelbase",
        comment = """The distance between the centers of the front and rear wheels.<br/><br/>

Typical unit code(s): CMT for centimeters, MTR for meters, INH for inches, FOT for foot/feet""",
        `@extends` = List(),
        `@range` = List(QuantitativeValue.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}