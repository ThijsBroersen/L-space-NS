package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object speed
    extends PropertyDef(
      iri = "http://schema.org/speed",
      iris = Set("http://schema.org/speed"),
      label = "speed",
      comment =
        """The speed range of the vehicle. If the vehicle is powered by an engine, the upper limit of the speed range (indicated by <a class="localLink" href="http://schema.org/maxValue">maxValue</a> should be the maximum speed achievable under regular conditions.<br/><br/>

Typical unit code(s): KMH for km/h, HM for mile per hour (0.447 04 m/s), KNT for knot<br/><br/>

*Note 1: Use <a class="localLink" href="http://schema.org/minValue">minValue</a> and <a class="localLink" href="http://schema.org/maxValue">maxValue</a> to indicate the range. Typically, the minimal value is zero.
* Note 2: There are many different ways of measuring the speed range. You can link to information about how the given value has been determined using the <a class="localLink" href="http://schema.org/valueReference">valueReference</a> property.""",
      `@extends` = () => List(),
      `@range` = () => List(QuantitativeValue.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
