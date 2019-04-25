package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object JobPosting
    extends OntologyDef(
      iri = "http://schema.org/JobPosting",
      iris = Set("http://schema.org/JobPosting"),
      label = "JobPosting",
      comment = """A listing that describes a job opening in a certain organization.""",
      `@extends` = () => List(Intangible.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Intangible.Properties {
    lazy val industry = lspace.ns.vocab.schema.industry.property
  }
  override lazy val properties: List[LProperty] = List(industry)
  trait Properties extends lspace.ns.vocab.schema.Intangible.Properties {
    lazy val industry = lspace.ns.vocab.schema.industry.property
  }
}
