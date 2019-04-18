package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object supply extends PropertyDef(
        iri = "http://schema.org/supply",
        iris = Set("http://schema.org/supply"),
        label = "supply",
        comment = """A sub-property of instrument. A supply consumed when performing instructions or a direction.""",
        `@extends` = () => List(instrument.property),
        `@range` = () => List(Text.ontology, HowToSupply.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.instrument.Properties
}