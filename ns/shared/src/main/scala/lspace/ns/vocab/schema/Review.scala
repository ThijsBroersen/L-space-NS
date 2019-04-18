package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object Review
    extends OntologyDef(
      iri = "http://schema.org/Review",
      iris = Set("http://schema.org/Review"),
      label = "Review",
      comment = """A review of an item - for example, of a restaurant, movie, or store.""",
      `@extends` = () => List(CreativeWork.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.CreativeWork.Properties {
    lazy val reviewBody = lspace.ns.vocab.schema.reviewBody.property
  }
  override lazy val properties: List[Property] = List(reviewBody)
  trait Properties extends lspace.ns.vocab.schema.CreativeWork.Properties {
    lazy val reviewBody = lspace.ns.vocab.schema.reviewBody.property
  }
}
