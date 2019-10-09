package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Brand extends OntologyDef(
        iri = "http://schema.org/Brand",
        iris = Set("http://schema.org/Brand"),
        label = "Brand",
        comment = """A brand is a name used by an organization or business person for labeling a product, product group, or similar.""",
        `@extends` = List(Intangible.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Intangible.Properties{
lazy val aggregateRating = lspace.ns.vocab.schema.aggregateRating.property
lazy val logo = lspace.ns.vocab.schema.logo.property
lazy val review = lspace.ns.vocab.schema.review.property
lazy val slogan = lspace.ns.vocab.schema.slogan.property
}
override lazy val properties: List[LProperty] = List(aggregateRating, logo, review, slogan)
trait Properties extends lspace.ns.vocab.schema.Intangible.Properties{
lazy val aggregateRating = lspace.ns.vocab.schema.aggregateRating.property
lazy val logo = lspace.ns.vocab.schema.logo.property
lazy val review = lspace.ns.vocab.schema.review.property
lazy val slogan = lspace.ns.vocab.schema.slogan.property
}
}