package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object payload extends PropertyDef(
        iri = "http://schema.org/payload",
        iris = Set("http://schema.org/payload"),
        label = "payload",
        comment = """The permitted weight of passengers and cargo, EXCLUDING the weight of the empty vehicle.<br/><br/>

Typical unit code(s): KGM for kilogram, LBR for pound<br/><br/>

<ul>
<li>Note 1: Many databases specify the permitted TOTAL weight instead, which is the sum of <a class="localLink" href="http://schema.org/weight">weight</a> and <a class="localLink" href="http://schema.org/payload">payload</a></li>
<li>Note 2: You can indicate additional information in the <a class="localLink" href="http://schema.org/name">name</a> of the <a class="localLink" href="http://schema.org/QuantitativeValue">QuantitativeValue</a> node.</li>
<li>Note 3: You may also link to a <a class="localLink" href="http://schema.org/QualitativeValue">QualitativeValue</a> node that provides additional information using <a class="localLink" href="http://schema.org/valueReference">valueReference</a>.</li>
<li>Note 4: Note that you can use <a class="localLink" href="http://schema.org/minValue">minValue</a> and <a class="localLink" href="http://schema.org/maxValue">maxValue</a> to indicate ranges.</li>
</ul>
""",
        `@extends` = List(),
        `@range` = List(QuantitativeValue.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}