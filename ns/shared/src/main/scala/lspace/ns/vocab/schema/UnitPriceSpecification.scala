package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object UnitPriceSpecification extends OntologyDef(
        iri = "http://schema.org/UnitPriceSpecification",
        iris = Set("http://schema.org/UnitPriceSpecification"),
        label = "UnitPriceSpecification",
        comment = """The price asked for a given offer by the respective organization or person.""",
        `@extends` = () => List(PriceSpecification.ontology)
       ){
object keys extends lspace.ns.vocab.schema.PriceSpecification.Properties{
lazy val billingIncrement = lspace.ns.vocab.schema.billingIncrement.property
lazy val priceType = lspace.ns.vocab.schema.priceType.property
lazy val referenceQuantity = lspace.ns.vocab.schema.referenceQuantity.property
lazy val unitCode = lspace.ns.vocab.schema.unitCode.property
lazy val unitText = lspace.ns.vocab.schema.unitText.property
}
override lazy val properties: List[LProperty] = List(billingIncrement, priceType, referenceQuantity, unitCode, unitText)
trait Properties extends lspace.ns.vocab.schema.PriceSpecification.Properties{
lazy val billingIncrement = lspace.ns.vocab.schema.billingIncrement.property
lazy val priceType = lspace.ns.vocab.schema.priceType.property
lazy val referenceQuantity = lspace.ns.vocab.schema.referenceQuantity.property
lazy val unitCode = lspace.ns.vocab.schema.unitCode.property
lazy val unitText = lspace.ns.vocab.schema.unitText.property
}
}