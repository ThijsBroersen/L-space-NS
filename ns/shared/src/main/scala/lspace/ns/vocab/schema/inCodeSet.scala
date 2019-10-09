package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object inCodeSet extends PropertyDef(
        iri = "http://schema.org/inCodeSet",
        iris = Set("http://schema.org/inCodeSet"),
        label = "inCodeSet",
        comment = """A <a class="localLink" href="http://schema.org/CategoryCodeSet">CategoryCodeSet</a> that contains this category code.""",
        `@extends` = List(inDefinedTermSet.property),
        `@range` = List(URL.ontology, CategoryCodeSet.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.inDefinedTermSet.Properties
}