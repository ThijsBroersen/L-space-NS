package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object CriticReview
    extends OntologyDef(
      iri = "http://schema.org/CriticReview",
      iris = Set("http://schema.org/CriticReview"),
      label = "CriticReview",
      comment =
        """A <a class="localLink" href="http://schema.org/CriticReview">CriticReview</a> is a more specialized form of Review written or published by a source that is recognized for its reviewing activities. These can include online columns, travel and food guides, TV and radio shows, blogs and other independent Web sites. <a class="localLink" href="http://schema.org/CriticReview">CriticReview</a>s are typically more in-depth and professionally written. For simpler, casually written user/visitor/viewer/customer reviews, it is more appropriate to use the <a class="localLink" href="http://schema.org/UserReview">UserReview</a> type. Review aggregator sites such as Metacritic already separate out the site's user reviews from selected critic reviews that originate from third-party sources.""",
      `@extends` = () => List(Review.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Review.Properties {}
  override lazy val properties: List[LProperty] = List()
  trait Properties extends lspace.ns.vocab.schema.Review.Properties {}
}
