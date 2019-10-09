package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object cargoVolume extends PropertyDef(
        iri = "http://schema.org/cargoVolume",
        iris = Set("http://schema.org/cargoVolume"),
        label = "cargoVolume",
        comment = """The available volume for cargo or luggage. For automobiles, this is usually the trunk volume.<br/><br/>

Typical unit code(s): LTR for liters, FTQ for cubic foot/feet<br/><br/>

Note: You can use <a class="localLink" href="http://schema.org/minValue">minValue</a> and <a class="localLink" href="http://schema.org/maxValue">maxValue</a> to indicate ranges.""",
        `@extends` = List(),
        `@range` = List(QuantitativeValue.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}