package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object reviewRating
    extends PropertyDef(
      iri = "http://schema.org/reviewRating",
      iris = Set("http://schema.org/reviewRating"),
      label = "reviewRating",
      comment =
        """The rating given in this review. Note that reviews can themselves be rated. The <code>reviewRating</code> applies to rating given by the review. The <a class="localLink" href="http://schema.org/aggregateRating">aggregateRating</a> property applies to the review itself, as a creative work.""",
      `@extends` = () => List(),
      `@range` = () => List(Rating.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
