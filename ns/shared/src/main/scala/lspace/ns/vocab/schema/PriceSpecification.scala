package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object PriceSpecification extends OntologyDef(
        iri = "http://schema.org/PriceSpecification",
        iris = Set("http://schema.org/PriceSpecification"),
        label = "PriceSpecification",
        comment = """A structured value representing a price or price range. Typically, only the subclasses of this type are used for markup. It is recommended to use <a class="localLink" href="http://schema.org/MonetaryAmount">MonetaryAmount</a> to describe independent amounts of money such as a salary, credit card limits, etc.""",
        `@extends` = () => List(StructuredValue.ontology)
       ){
object keys extends lspace.ns.vocab.schema.StructuredValue.Properties{
lazy val eligibleQuantity = lspace.ns.vocab.schema.eligibleQuantity.property
lazy val eligibleTransactionVolume = lspace.ns.vocab.schema.eligibleTransactionVolume.property
lazy val maxPrice = lspace.ns.vocab.schema.maxPrice.property
lazy val minPrice = lspace.ns.vocab.schema.minPrice.property
lazy val price = lspace.ns.vocab.schema.price.property
lazy val priceCurrency = lspace.ns.vocab.schema.priceCurrency.property
lazy val validFrom = lspace.ns.vocab.schema.validFrom.property
lazy val validThrough = lspace.ns.vocab.schema.validThrough.property
lazy val valueAddedTaxIncluded = lspace.ns.vocab.schema.valueAddedTaxIncluded.property
}
override lazy val properties: List[LProperty] = List(eligibleQuantity, eligibleTransactionVolume, maxPrice, minPrice, price, priceCurrency, validFrom, validThrough, valueAddedTaxIncluded)
trait Properties extends lspace.ns.vocab.schema.StructuredValue.Properties{
lazy val eligibleQuantity = lspace.ns.vocab.schema.eligibleQuantity.property
lazy val eligibleTransactionVolume = lspace.ns.vocab.schema.eligibleTransactionVolume.property
lazy val maxPrice = lspace.ns.vocab.schema.maxPrice.property
lazy val minPrice = lspace.ns.vocab.schema.minPrice.property
lazy val price = lspace.ns.vocab.schema.price.property
lazy val priceCurrency = lspace.ns.vocab.schema.priceCurrency.property
lazy val validFrom = lspace.ns.vocab.schema.validFrom.property
lazy val validThrough = lspace.ns.vocab.schema.validThrough.property
lazy val valueAddedTaxIncluded = lspace.ns.vocab.schema.valueAddedTaxIncluded.property
}
}