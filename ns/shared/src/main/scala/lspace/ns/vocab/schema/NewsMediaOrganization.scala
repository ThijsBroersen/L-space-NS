package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object NewsMediaOrganization
    extends OntologyDef(
      iri = "http://schema.org/NewsMediaOrganization",
      iris = Set("http://schema.org/NewsMediaOrganization"),
      label = "NewsMediaOrganization",
      comment = """A News/Media organization such as a newspaper or TV station.""",
      `@extends` = () => List(Organization.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Organization.Properties {
    lazy val verificationFactCheckingPolicy  = lspace.ns.vocab.schema.verificationFactCheckingPolicy.property
    lazy val missionCoveragePrioritiesPolicy = lspace.ns.vocab.schema.missionCoveragePrioritiesPolicy.property
    lazy val noBylinesPolicy                 = lspace.ns.vocab.schema.noBylinesPolicy.property
    lazy val masthead                        = lspace.ns.vocab.schema.masthead.property
  }
  override lazy val properties: List[Property] =
    List(verificationFactCheckingPolicy, missionCoveragePrioritiesPolicy, noBylinesPolicy, masthead)
  trait Properties extends lspace.ns.vocab.schema.Organization.Properties {
    lazy val verificationFactCheckingPolicy  = lspace.ns.vocab.schema.verificationFactCheckingPolicy.property
    lazy val missionCoveragePrioritiesPolicy = lspace.ns.vocab.schema.missionCoveragePrioritiesPolicy.property
    lazy val noBylinesPolicy                 = lspace.ns.vocab.schema.noBylinesPolicy.property
    lazy val masthead                        = lspace.ns.vocab.schema.masthead.property
  }
}
