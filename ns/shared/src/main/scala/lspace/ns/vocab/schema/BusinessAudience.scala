package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object BusinessAudience
    extends OntologyDef(
      iri = "http://schema.org/BusinessAudience",
      iris = Set("http://schema.org/BusinessAudience"),
      label = "BusinessAudience",
      comment = """A set of characteristics belonging to businesses, e.g. who compose an item's target audience.""",
      `@extends` = () => List(Audience.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Audience.Properties {
    lazy val numberOfEmployees = lspace.ns.vocab.schema.numberOfEmployees.property
  }
  override lazy val properties: List[Property] = List(numberOfEmployees)
  trait Properties extends lspace.ns.vocab.schema.Audience.Properties {
    lazy val numberOfEmployees = lspace.ns.vocab.schema.numberOfEmployees.property
  }
}
