package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Review extends OntologyDef(
        iri = "http://schema.org/Review",
        iris = Set("http://schema.org/Review"),
        label = "Review",
        comment = """A review of an item - for example, of a restaurant, movie, or store.""",
        `@extends` = List(CreativeWork.ontology)
       ){
object keys extends lspace.ns.vocab.schema.CreativeWork.Properties{
lazy val itemReviewed = lspace.ns.vocab.schema.itemReviewed.property
lazy val reviewAspect = lspace.ns.vocab.schema.reviewAspect.property
lazy val reviewBody = lspace.ns.vocab.schema.reviewBody.property
lazy val reviewRating = lspace.ns.vocab.schema.reviewRating.property
}
override lazy val properties: List[LProperty] = List(itemReviewed, reviewAspect, reviewBody, reviewRating)
trait Properties extends lspace.ns.vocab.schema.CreativeWork.Properties{
lazy val itemReviewed = lspace.ns.vocab.schema.itemReviewed.property
lazy val reviewAspect = lspace.ns.vocab.schema.reviewAspect.property
lazy val reviewBody = lspace.ns.vocab.schema.reviewBody.property
lazy val reviewRating = lspace.ns.vocab.schema.reviewRating.property
}
}