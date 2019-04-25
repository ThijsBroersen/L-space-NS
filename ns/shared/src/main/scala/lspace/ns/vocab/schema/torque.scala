package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object torque
    extends PropertyDef(
      iri = "http://schema.org/torque",
      iris = Set("http://schema.org/torque"),
      label = "torque",
      comment =
        """The torque (turning force) of the vehicle's engine.<br/><br/>

Typical unit code(s): NU for newton metre (N m), F17 for pound-force per foot, or F48 for pound-force per inch<br/><br/>

<ul>
<li>Note 1: You can link to information about how the given value has been determined (e.g. reference RPM) using the <a class="localLink" href="http://schema.org/valueReference">valueReference</a> property.</li>
<li>Note 2: You can use <a class="localLink" href="http://schema.org/minValue">minValue</a> and <a class="localLink" href="http://schema.org/maxValue">maxValue</a> to indicate ranges.</li>
</ul>
""",
      `@extends` = () => List(),
      `@range` = () => List(QuantitativeValue.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
