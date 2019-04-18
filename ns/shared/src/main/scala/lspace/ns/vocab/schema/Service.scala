package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object Service
    extends OntologyDef(
      iri = "http://schema.org/Service",
      iris = Set("http://schema.org/Service"),
      label = "Service",
      comment = """A service provided by an organization, e.g. delivery service, print services, etc.""",
      `@extends` = () => List(Intangible.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Intangible.Properties {
    lazy val brand          = lspace.ns.vocab.schema.brand.property
    lazy val slogan         = lspace.ns.vocab.schema.slogan.property
    lazy val termsOfService = lspace.ns.vocab.schema.termsOfService.property
    lazy val produces       = lspace.ns.vocab.schema.produces.property
  }
  override lazy val properties: List[Property] = List(brand, slogan, termsOfService, produces)
  trait Properties extends lspace.ns.vocab.schema.Intangible.Properties {
    lazy val brand          = lspace.ns.vocab.schema.brand.property
    lazy val slogan         = lspace.ns.vocab.schema.slogan.property
    lazy val termsOfService = lspace.ns.vocab.schema.termsOfService.property
    lazy val produces       = lspace.ns.vocab.schema.produces.property
  }
}
