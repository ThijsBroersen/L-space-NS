package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object FoodEstablishment
    extends OntologyDef(
      iri = "http://schema.org/FoodEstablishment",
      iris = Set("http://schema.org/FoodEstablishment"),
      label = "FoodEstablishment",
      comment = """A food-related business.""",
      `@extends` = () => List(LocalBusiness.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.LocalBusiness.Properties {
    lazy val acceptsReservations = lspace.ns.vocab.schema.acceptsReservations.property
    lazy val starRating          = lspace.ns.vocab.schema.starRating.property
    lazy val servesCuisine       = lspace.ns.vocab.schema.servesCuisine.property
    lazy val menu                = lspace.ns.vocab.schema.menu.property
    lazy val hasMenu             = lspace.ns.vocab.schema.hasMenu.property
    override lazy val events     = lspace.ns.vocab.schema.events.property
    override lazy val slogan     = lspace.ns.vocab.schema.slogan.property
    override lazy val event      = lspace.ns.vocab.schema.event.property
    override lazy val logo       = lspace.ns.vocab.schema.logo.property
    override lazy val telephone  = lspace.ns.vocab.schema.telephone.property
    override lazy val isicV4     = lspace.ns.vocab.schema.isicV4.property
    override lazy val review     = lspace.ns.vocab.schema.review.property
  }
  override lazy val properties: List[LProperty] = List(acceptsReservations, starRating, servesCuisine, menu, hasMenu)
  trait Properties extends lspace.ns.vocab.schema.LocalBusiness.Properties {
    lazy val acceptsReservations = lspace.ns.vocab.schema.acceptsReservations.property
    lazy val starRating          = lspace.ns.vocab.schema.starRating.property
    lazy val servesCuisine       = lspace.ns.vocab.schema.servesCuisine.property
    lazy val menu                = lspace.ns.vocab.schema.menu.property
    lazy val hasMenu             = lspace.ns.vocab.schema.hasMenu.property
    override lazy val events     = lspace.ns.vocab.schema.events.property
    override lazy val slogan     = lspace.ns.vocab.schema.slogan.property
    override lazy val event      = lspace.ns.vocab.schema.event.property
    override lazy val logo       = lspace.ns.vocab.schema.logo.property
    override lazy val telephone  = lspace.ns.vocab.schema.telephone.property
    override lazy val isicV4     = lspace.ns.vocab.schema.isicV4.property
    override lazy val review     = lspace.ns.vocab.schema.review.property
  }
}
