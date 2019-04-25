package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Rating
    extends OntologyDef(
      iri = "http://schema.org/Rating",
      iris = Set("http://schema.org/Rating"),
      label = "Rating",
      comment = """A rating is an evaluation on a numeric scale, such as 1 to 5 stars.""",
      `@extends` = () => List(Intangible.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Intangible.Properties {
    lazy val author       = lspace.ns.vocab.schema.author.property
    lazy val worstRating  = lspace.ns.vocab.schema.worstRating.property
    lazy val reviewAspect = lspace.ns.vocab.schema.reviewAspect.property
  }
  override lazy val properties: List[LProperty] = List(author, worstRating, reviewAspect)
  trait Properties extends lspace.ns.vocab.schema.Intangible.Properties {
    lazy val author       = lspace.ns.vocab.schema.author.property
    lazy val worstRating  = lspace.ns.vocab.schema.worstRating.property
    lazy val reviewAspect = lspace.ns.vocab.schema.reviewAspect.property
  }
}
