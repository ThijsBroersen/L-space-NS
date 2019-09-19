package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object estimatedCost extends PropertyDef(
        iri = "http://schema.org/estimatedCost",
        iris = Set("http://schema.org/estimatedCost"),
        label = "estimatedCost",
        comment = """The estimated cost of the supply or supplies consumed when performing instructions.""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology, MonetaryAmount.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}