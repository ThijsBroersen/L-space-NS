package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object mileageFromOdometer extends PropertyDef(
        iri = "http://schema.org/mileageFromOdometer",
        iris = Set("http://schema.org/mileageFromOdometer"),
        label = "mileageFromOdometer",
        comment = """The total distance travelled by the particular vehicle since its initial production, as read from its odometer.<br/><br/>

Typical unit code(s): KMT for kilometers, SMI for statute miles""",
        `@extends` = () => List(),
        `@range` = () => List(QuantitativeValue.ontology)
       ){
}