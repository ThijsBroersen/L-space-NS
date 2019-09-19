package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ParcelDelivery extends OntologyDef(
        iri = "http://schema.org/ParcelDelivery",
        iris = Set("http://schema.org/ParcelDelivery"),
        label = "ParcelDelivery",
        comment = """The delivery of a parcel either via the postal service or a commercial service.""",
        `@extends` = () => List(Intangible.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Intangible.Properties{
lazy val deliveryAddress = lspace.ns.vocab.schema.deliveryAddress.property
lazy val deliveryStatus = lspace.ns.vocab.schema.deliveryStatus.property
lazy val expectedArrivalFrom = lspace.ns.vocab.schema.expectedArrivalFrom.property
lazy val expectedArrivalUntil = lspace.ns.vocab.schema.expectedArrivalUntil.property
lazy val hasDeliveryMethod = lspace.ns.vocab.schema.hasDeliveryMethod.property
lazy val itemShipped = lspace.ns.vocab.schema.itemShipped.property
lazy val originAddress = lspace.ns.vocab.schema.originAddress.property
lazy val partOfOrder = lspace.ns.vocab.schema.partOfOrder.property
lazy val provider = lspace.ns.vocab.schema.provider.property
lazy val trackingNumber = lspace.ns.vocab.schema.trackingNumber.property
lazy val trackingUrl = lspace.ns.vocab.schema.trackingUrl.property
}
override lazy val properties: List[LProperty] = List(deliveryAddress, deliveryStatus, expectedArrivalFrom, expectedArrivalUntil, hasDeliveryMethod, itemShipped, originAddress, partOfOrder, provider, trackingNumber, trackingUrl)
trait Properties extends lspace.ns.vocab.schema.Intangible.Properties{
lazy val deliveryAddress = lspace.ns.vocab.schema.deliveryAddress.property
lazy val deliveryStatus = lspace.ns.vocab.schema.deliveryStatus.property
lazy val expectedArrivalFrom = lspace.ns.vocab.schema.expectedArrivalFrom.property
lazy val expectedArrivalUntil = lspace.ns.vocab.schema.expectedArrivalUntil.property
lazy val hasDeliveryMethod = lspace.ns.vocab.schema.hasDeliveryMethod.property
lazy val itemShipped = lspace.ns.vocab.schema.itemShipped.property
lazy val originAddress = lspace.ns.vocab.schema.originAddress.property
lazy val partOfOrder = lspace.ns.vocab.schema.partOfOrder.property
lazy val provider = lspace.ns.vocab.schema.provider.property
lazy val trackingNumber = lspace.ns.vocab.schema.trackingNumber.property
lazy val trackingUrl = lspace.ns.vocab.schema.trackingUrl.property
}
}