package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object identifier extends PropertyDef(
        iri = "http://schema.org/identifier",
        iris = Set("http://schema.org/identifier"),
        label = "identifier",
        comment = """The identifier property represents any kind of identifier for any kind of <a class="localLink" href="http://schema.org/Thing">Thing</a>, such as ISBNs, GTIN codes, UUIDs etc. Schema.org provides dedicated properties for representing many of these, either as textual strings or as URL (URI) links. See <a href="/docs/datamodel.html#identifierBg">background notes</a> for more details.""",
        `@extends` = List(),
        `@range` = List(URL.ontology, `@string`, PropertyValue.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}