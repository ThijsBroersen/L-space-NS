package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object valueAddedTaxIncluded extends PropertyDef(
        iri = "http://schema.org/valueAddedTaxIncluded",
        iris = Set("http://schema.org/valueAddedTaxIncluded"),
        label = "valueAddedTaxIncluded",
        comment = """Specifies whether the applicable value-added tax (VAT) is included in the price specification or not.""",
        `@extends` = List(),
        `@range` = List(`@boolean`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}