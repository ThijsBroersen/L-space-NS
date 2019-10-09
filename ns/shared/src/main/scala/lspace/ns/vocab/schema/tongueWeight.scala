package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object tongueWeight extends PropertyDef(
        iri = "http://schema.org/tongueWeight",
        iris = Set("http://schema.org/tongueWeight"),
        label = "tongueWeight",
        comment = """The permitted vertical load (TWR) of a trailer attached to the vehicle. Also referred to as Tongue Load Rating (TLR) or Vertical Load Rating (VLR)<br/><br/>

Typical unit code(s): KGM for kilogram, LBR for pound<br/><br/>

<ul>
<li>Note 1: You can indicate additional information in the <a class="localLink" href="http://schema.org/name">name</a> of the <a class="localLink" href="http://schema.org/QuantitativeValue">QuantitativeValue</a> node.</li>
<li>Note 2: You may also link to a <a class="localLink" href="http://schema.org/QualitativeValue">QualitativeValue</a> node that provides additional information using <a class="localLink" href="http://schema.org/valueReference">valueReference</a>.</li>
<li>Note 3: Note that you can use <a class="localLink" href="http://schema.org/minValue">minValue</a> and <a class="localLink" href="http://schema.org/maxValue">maxValue</a> to indicate ranges.</li>
</ul>
""",
        `@extends` = List(),
        `@range` = List(QuantitativeValue.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}