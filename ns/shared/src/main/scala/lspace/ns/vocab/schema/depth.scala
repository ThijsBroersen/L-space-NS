package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object depth extends PropertyDef(
        iri = "http://schema.org/depth",
        iris = Set("http://schema.org/depth"),
        label = "depth",
        comment = """The depth of the item.""",
        `@extends` = () => List(),
        `@range` = () => List(QuantitativeValue.ontology, Distance.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}