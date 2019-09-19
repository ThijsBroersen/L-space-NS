package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Product extends OntologyDef(
        iri = "http://schema.org/Product",
        iris = Set("http://schema.org/Product"),
        label = "Product",
        comment = """Any offered product or service. For example: a pair of shoes; a concert ticket; the rental of a car; a haircut; or an episode of a TV show streamed online.""",
        `@extends` = () => List(Thing.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Thing.Properties{
lazy val additionalProperty = lspace.ns.vocab.schema.additionalProperty.property
lazy val aggregateRating = lspace.ns.vocab.schema.aggregateRating.property
lazy val audience = lspace.ns.vocab.schema.audience.property
lazy val award = lspace.ns.vocab.schema.award.property
lazy val brand = lspace.ns.vocab.schema.brand.property
lazy val category = lspace.ns.vocab.schema.category.property
lazy val color = lspace.ns.vocab.schema.color.property
lazy val depth = lspace.ns.vocab.schema.depth.property
lazy val gtin12 = lspace.ns.vocab.schema.gtin12.property
lazy val gtin13 = lspace.ns.vocab.schema.gtin13.property
lazy val gtin14 = lspace.ns.vocab.schema.gtin14.property
lazy val gtin8 = lspace.ns.vocab.schema.gtin8.property
lazy val height = lspace.ns.vocab.schema.height.property
lazy val isAccessoryOrSparePartFor = lspace.ns.vocab.schema.isAccessoryOrSparePartFor.property
lazy val isConsumableFor = lspace.ns.vocab.schema.isConsumableFor.property
lazy val isRelatedTo = lspace.ns.vocab.schema.isRelatedTo.property
lazy val isSimilarTo = lspace.ns.vocab.schema.isSimilarTo.property
lazy val itemCondition = lspace.ns.vocab.schema.itemCondition.property
lazy val logo = lspace.ns.vocab.schema.logo.property
lazy val manufacturer = lspace.ns.vocab.schema.manufacturer.property
lazy val material = lspace.ns.vocab.schema.material.property
lazy val model = lspace.ns.vocab.schema.model.property
lazy val mpn = lspace.ns.vocab.schema.mpn.property
lazy val nsn = lspace.ns.vocab.schema.nsn.property
lazy val offers = lspace.ns.vocab.schema.offers.property
lazy val productID = lspace.ns.vocab.schema.productID.property
lazy val productionDate = lspace.ns.vocab.schema.productionDate.property
lazy val purchaseDate = lspace.ns.vocab.schema.purchaseDate.property
lazy val releaseDate = lspace.ns.vocab.schema.releaseDate.property
lazy val review = lspace.ns.vocab.schema.review.property
lazy val sku = lspace.ns.vocab.schema.sku.property
lazy val slogan = lspace.ns.vocab.schema.slogan.property
lazy val weight = lspace.ns.vocab.schema.weight.property
lazy val width = lspace.ns.vocab.schema.width.property
}
override lazy val properties: List[LProperty] = List(additionalProperty, aggregateRating, audience, award, brand, category, color, depth, gtin12, gtin13, gtin14, gtin8, height, isAccessoryOrSparePartFor, isConsumableFor, isRelatedTo, isSimilarTo, itemCondition, logo, manufacturer, material, model, mpn, nsn, offers, productID, productionDate, purchaseDate, releaseDate, review, sku, slogan, weight, width)
trait Properties extends lspace.ns.vocab.schema.Thing.Properties{
lazy val additionalProperty = lspace.ns.vocab.schema.additionalProperty.property
lazy val aggregateRating = lspace.ns.vocab.schema.aggregateRating.property
lazy val audience = lspace.ns.vocab.schema.audience.property
lazy val award = lspace.ns.vocab.schema.award.property
lazy val brand = lspace.ns.vocab.schema.brand.property
lazy val category = lspace.ns.vocab.schema.category.property
lazy val color = lspace.ns.vocab.schema.color.property
lazy val depth = lspace.ns.vocab.schema.depth.property
lazy val gtin12 = lspace.ns.vocab.schema.gtin12.property
lazy val gtin13 = lspace.ns.vocab.schema.gtin13.property
lazy val gtin14 = lspace.ns.vocab.schema.gtin14.property
lazy val gtin8 = lspace.ns.vocab.schema.gtin8.property
lazy val height = lspace.ns.vocab.schema.height.property
lazy val isAccessoryOrSparePartFor = lspace.ns.vocab.schema.isAccessoryOrSparePartFor.property
lazy val isConsumableFor = lspace.ns.vocab.schema.isConsumableFor.property
lazy val isRelatedTo = lspace.ns.vocab.schema.isRelatedTo.property
lazy val isSimilarTo = lspace.ns.vocab.schema.isSimilarTo.property
lazy val itemCondition = lspace.ns.vocab.schema.itemCondition.property
lazy val logo = lspace.ns.vocab.schema.logo.property
lazy val manufacturer = lspace.ns.vocab.schema.manufacturer.property
lazy val material = lspace.ns.vocab.schema.material.property
lazy val model = lspace.ns.vocab.schema.model.property
lazy val mpn = lspace.ns.vocab.schema.mpn.property
lazy val nsn = lspace.ns.vocab.schema.nsn.property
lazy val offers = lspace.ns.vocab.schema.offers.property
lazy val productID = lspace.ns.vocab.schema.productID.property
lazy val productionDate = lspace.ns.vocab.schema.productionDate.property
lazy val purchaseDate = lspace.ns.vocab.schema.purchaseDate.property
lazy val releaseDate = lspace.ns.vocab.schema.releaseDate.property
lazy val review = lspace.ns.vocab.schema.review.property
lazy val sku = lspace.ns.vocab.schema.sku.property
lazy val slogan = lspace.ns.vocab.schema.slogan.property
lazy val weight = lspace.ns.vocab.schema.weight.property
lazy val width = lspace.ns.vocab.schema.width.property
}
}