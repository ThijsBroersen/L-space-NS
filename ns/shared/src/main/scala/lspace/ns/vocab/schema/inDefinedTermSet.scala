package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object inDefinedTermSet extends PropertyDef(
        iri = "http://schema.org/inDefinedTermSet",
        iris = Set("http://schema.org/inDefinedTermSet"),
        label = "inDefinedTermSet",
        comment = """A <a class="localLink" href="http://schema.org/DefinedTermSet">DefinedTermSet</a> that contains this term.""",
        `@extends` = () => List(isPartOf.property),
        `@range` = () => List(DefinedTermSet.ontology, URL.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.isPartOf.Properties
}