package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Product
    extends OntologyDef(
      iri = "http://schema.org/Product",
      iris = Set("http://schema.org/Product"),
      label = "Product",
      comment =
        """Any offered product or service. For example: a pair of shoes; a concert ticket; the rental of a car; a haircut; or an episode of a TV show streamed online.""",
      `@extends` = () => List(Thing.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Thing.Properties {
    lazy val color          = lspace.ns.vocab.schema.color.property
    lazy val itemCondition  = lspace.ns.vocab.schema.itemCondition.property
    lazy val depth          = lspace.ns.vocab.schema.depth.property
    lazy val productionDate = lspace.ns.vocab.schema.productionDate.property
    lazy val awards         = lspace.ns.vocab.schema.awards.property
    lazy val slogan         = lspace.ns.vocab.schema.slogan.property
    lazy val isRelatedTo    = lspace.ns.vocab.schema.isRelatedTo.property
    lazy val purchaseDate   = lspace.ns.vocab.schema.purchaseDate.property
    lazy val brand          = lspace.ns.vocab.schema.brand.property
    lazy val isSimilarTo    = lspace.ns.vocab.schema.isSimilarTo.property
    lazy val productID      = lspace.ns.vocab.schema.productID.property
    lazy val weight         = lspace.ns.vocab.schema.weight.property
    lazy val review         = lspace.ns.vocab.schema.review.property
    lazy val model          = lspace.ns.vocab.schema.model.property
    lazy val releaseDate    = lspace.ns.vocab.schema.releaseDate.property
  }
  override lazy val properties: List[LProperty] = List(color,
                                                       itemCondition,
                                                       depth,
                                                       productionDate,
                                                       awards,
                                                       slogan,
                                                       isRelatedTo,
                                                       purchaseDate,
                                                       brand,
                                                       isSimilarTo,
                                                       productID,
                                                       weight,
                                                       review,
                                                       model,
                                                       releaseDate)
  trait Properties extends lspace.ns.vocab.schema.Thing.Properties {
    lazy val color          = lspace.ns.vocab.schema.color.property
    lazy val itemCondition  = lspace.ns.vocab.schema.itemCondition.property
    lazy val depth          = lspace.ns.vocab.schema.depth.property
    lazy val productionDate = lspace.ns.vocab.schema.productionDate.property
    lazy val awards         = lspace.ns.vocab.schema.awards.property
    lazy val slogan         = lspace.ns.vocab.schema.slogan.property
    lazy val isRelatedTo    = lspace.ns.vocab.schema.isRelatedTo.property
    lazy val purchaseDate   = lspace.ns.vocab.schema.purchaseDate.property
    lazy val brand          = lspace.ns.vocab.schema.brand.property
    lazy val isSimilarTo    = lspace.ns.vocab.schema.isSimilarTo.property
    lazy val productID      = lspace.ns.vocab.schema.productID.property
    lazy val weight         = lspace.ns.vocab.schema.weight.property
    lazy val review         = lspace.ns.vocab.schema.review.property
    lazy val model          = lspace.ns.vocab.schema.model.property
    lazy val releaseDate    = lspace.ns.vocab.schema.releaseDate.property
  }
}
