package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object engineDisplacement extends PropertyDef(
        iri = "http://schema.org/engineDisplacement",
        iris = Set("http://schema.org/engineDisplacement"),
        label = "engineDisplacement",
        comment = """The volume swept by all of the pistons inside the cylinders of an internal combustion engine in a single movement. <br/><br/>

Typical unit code(s): CMQ for cubic centimeter, LTR for liters, INQ for cubic inches
* Note 1: You can link to information about how the given value has been determined using the <a class="localLink" href="http://schema.org/valueReference">valueReference</a> property.
* Note 2: You can use <a class="localLink" href="http://schema.org/minValue">minValue</a> and <a class="localLink" href="http://schema.org/maxValue">maxValue</a> to indicate ranges.""",
        `@extends` = () => List(),
        `@range` = () => List(QuantitativeValue.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}