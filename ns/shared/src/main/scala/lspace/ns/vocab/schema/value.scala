package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object value extends PropertyDef(
        iri = "http://schema.org/value",
        iris = Set("http://schema.org/value"),
        label = "value",
        comment = """The value of the quantitative value or property value node.<br/><br/>

<ul>
<li>For <a class="localLink" href="http://schema.org/QuantitativeValue">QuantitativeValue</a> and <a class="localLink" href="http://schema.org/MonetaryAmount">MonetaryAmount</a>, the recommended type for values is 'Number'.</li>
<li>For <a class="localLink" href="http://schema.org/PropertyValue">PropertyValue</a>, it can be 'Text;', 'Number', 'Boolean', or 'StructuredValue'.</li>
</ul>
""",
        `@extends` = () => List(),
        `@range` = () => List(`@number`, `@boolean`, StructuredValue.ontology, Text.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}