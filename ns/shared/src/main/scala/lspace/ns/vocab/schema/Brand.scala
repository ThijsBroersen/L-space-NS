package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object Brand
    extends OntologyDef(
      iri = "http://schema.org/Brand",
      iris = Set("http://schema.org/Brand"),
      label = "Brand",
      comment =
        """A brand is a name used by an organization or business person for labeling a product, product group, or similar.""",
      `@extends` = () => List(Intangible.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Intangible.Properties {
    lazy val slogan = lspace.ns.vocab.schema.slogan.property
    lazy val review = lspace.ns.vocab.schema.review.property
  }
  override lazy val properties: List[Property] = List(slogan, review)
  trait Properties extends lspace.ns.vocab.schema.Intangible.Properties {
    lazy val slogan = lspace.ns.vocab.schema.slogan.property
    lazy val review = lspace.ns.vocab.schema.review.property
  }
}
