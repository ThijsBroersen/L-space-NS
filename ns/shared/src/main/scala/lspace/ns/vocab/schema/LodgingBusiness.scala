package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object LodgingBusiness extends OntologyDef(
        iri = "http://schema.org/LodgingBusiness",
        iris = Set("http://schema.org/LodgingBusiness"),
        label = "LodgingBusiness",
        comment = """A lodging business, such as a motel, hotel, or inn.""",
        `@extends` = () => List(LocalBusiness.ontology)
       ){
object keys extends lspace.ns.vocab.schema.LocalBusiness.Properties{
lazy val audience = lspace.ns.vocab.schema.audience.property
lazy val availableLanguage = lspace.ns.vocab.schema.availableLanguage.property
lazy val checkinTime = lspace.ns.vocab.schema.checkinTime.property
lazy val checkoutTime = lspace.ns.vocab.schema.checkoutTime.property
lazy val petsAllowed = lspace.ns.vocab.schema.petsAllowed.property
lazy val starRating = lspace.ns.vocab.schema.starRating.property
override lazy val address = lspace.ns.vocab.schema.address.property
override lazy val aggregateRating = lspace.ns.vocab.schema.aggregateRating.property
override lazy val faxNumber = lspace.ns.vocab.schema.faxNumber.property
override lazy val globalLocationNumber = lspace.ns.vocab.schema.globalLocationNumber.property
override lazy val slogan = lspace.ns.vocab.schema.slogan.property
override lazy val event = lspace.ns.vocab.schema.event.property
override lazy val logo = lspace.ns.vocab.schema.logo.property
override lazy val telephone = lspace.ns.vocab.schema.telephone.property
override lazy val isicV4 = lspace.ns.vocab.schema.isicV4.property
override lazy val review = lspace.ns.vocab.schema.review.property}
override lazy val properties: List[LProperty] = List(audience, availableLanguage, checkinTime, checkoutTime, petsAllowed, starRating)
trait Properties extends lspace.ns.vocab.schema.LocalBusiness.Properties{
lazy val audience = lspace.ns.vocab.schema.audience.property
lazy val availableLanguage = lspace.ns.vocab.schema.availableLanguage.property
lazy val checkinTime = lspace.ns.vocab.schema.checkinTime.property
lazy val checkoutTime = lspace.ns.vocab.schema.checkoutTime.property
lazy val petsAllowed = lspace.ns.vocab.schema.petsAllowed.property
lazy val starRating = lspace.ns.vocab.schema.starRating.property
override lazy val address = lspace.ns.vocab.schema.address.property
override lazy val aggregateRating = lspace.ns.vocab.schema.aggregateRating.property
override lazy val faxNumber = lspace.ns.vocab.schema.faxNumber.property
override lazy val globalLocationNumber = lspace.ns.vocab.schema.globalLocationNumber.property
override lazy val slogan = lspace.ns.vocab.schema.slogan.property
override lazy val event = lspace.ns.vocab.schema.event.property
override lazy val logo = lspace.ns.vocab.schema.logo.property
override lazy val telephone = lspace.ns.vocab.schema.telephone.property
override lazy val isicV4 = lspace.ns.vocab.schema.isicV4.property
override lazy val review = lspace.ns.vocab.schema.review.property}
}