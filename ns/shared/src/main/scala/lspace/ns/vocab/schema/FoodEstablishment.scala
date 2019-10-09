package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object FoodEstablishment extends OntologyDef(
        iri = "http://schema.org/FoodEstablishment",
        iris = Set("http://schema.org/FoodEstablishment"),
        label = "FoodEstablishment",
        comment = """A food-related business.""",
        `@extends` = List(LocalBusiness.ontology)
       ){
object keys extends lspace.ns.vocab.schema.LocalBusiness.Properties{
lazy val acceptsReservations = lspace.ns.vocab.schema.acceptsReservations.property
lazy val hasMenu = lspace.ns.vocab.schema.hasMenu.property
lazy val servesCuisine = lspace.ns.vocab.schema.servesCuisine.property
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
override lazy val properties: List[LProperty] = List(acceptsReservations, hasMenu, servesCuisine, starRating)
trait Properties extends lspace.ns.vocab.schema.LocalBusiness.Properties{
lazy val acceptsReservations = lspace.ns.vocab.schema.acceptsReservations.property
lazy val hasMenu = lspace.ns.vocab.schema.hasMenu.property
lazy val servesCuisine = lspace.ns.vocab.schema.servesCuisine.property
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