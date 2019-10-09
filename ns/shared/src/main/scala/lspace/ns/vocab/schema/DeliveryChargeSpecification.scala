package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object DeliveryChargeSpecification extends OntologyDef(
        iri = "http://schema.org/DeliveryChargeSpecification",
        iris = Set("http://schema.org/DeliveryChargeSpecification"),
        label = "DeliveryChargeSpecification",
        comment = """The price for the delivery of an offer using a particular delivery method.""",
        `@extends` = List(PriceSpecification.ontology)
       ){
object keys extends lspace.ns.vocab.schema.PriceSpecification.Properties{
lazy val appliesToDeliveryMethod = lspace.ns.vocab.schema.appliesToDeliveryMethod.property
lazy val areaServed = lspace.ns.vocab.schema.areaServed.property
lazy val eligibleRegion = lspace.ns.vocab.schema.eligibleRegion.property
lazy val ineligibleRegion = lspace.ns.vocab.schema.ineligibleRegion.property
}
override lazy val properties: List[LProperty] = List(appliesToDeliveryMethod, areaServed, eligibleRegion, ineligibleRegion)
trait Properties extends lspace.ns.vocab.schema.PriceSpecification.Properties{
lazy val appliesToDeliveryMethod = lspace.ns.vocab.schema.appliesToDeliveryMethod.property
lazy val areaServed = lspace.ns.vocab.schema.areaServed.property
lazy val eligibleRegion = lspace.ns.vocab.schema.eligibleRegion.property
lazy val ineligibleRegion = lspace.ns.vocab.schema.ineligibleRegion.property
}
}