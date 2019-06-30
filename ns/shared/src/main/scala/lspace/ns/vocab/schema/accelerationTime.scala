package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object accelerationTime extends PropertyDef(
        iri = "http://schema.org/accelerationTime",
        iris = Set("http://schema.org/accelerationTime"),
        label = "accelerationTime",
        comment = """The time needed to accelerate the vehicle from a given start velocity to a given target velocity.<br/><br/>

Typical unit code(s): SEC for seconds<br/><br/>

<ul>
<li>Note: There are unfortunately no standard unit codes for seconds/0..100 km/h or seconds/0..60 mph. Simply use "SEC" for seconds and indicate the velocities in the <a class="localLink" href="http://schema.org/name">name</a> of the <a class="localLink" href="http://schema.org/QuantitativeValue">QuantitativeValue</a>, or use <a class="localLink" href="http://schema.org/valueReference">valueReference</a> with a <a class="localLink" href="http://schema.org/QuantitativeValue">QuantitativeValue</a> of 0..60 mph or 0..100 km/h to specify the reference speeds.</li>
</ul>
""",
        `@extends` = () => List(),
        `@range` = () => List(QuantitativeValue.ontology)
       ){
}