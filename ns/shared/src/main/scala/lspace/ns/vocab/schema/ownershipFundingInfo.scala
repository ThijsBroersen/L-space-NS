package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object ownershipFundingInfo
    extends PropertyDef(
      iri = "http://schema.org/ownershipFundingInfo",
      iris = Set("http://schema.org/ownershipFundingInfo"),
      label = "ownershipFundingInfo",
      comment =
        """For an <a class="localLink" href="http://schema.org/Organization">Organization</a> (often but not necessarily a <a class="localLink" href="http://schema.org/NewsMediaOrganization">NewsMediaOrganization</a>), a description of organizational ownership structure; funding and grants. In a news/media setting, this is with particular reference to editorial independence.   Note that the <a class="localLink" href="http://schema.org/funder">funder</a> is also available and can be used to make basic funder information machine-readable.""",
      `@extends` = () => List(publishingPrinciples.property),
      `@range` = () => List(URL.ontology, Text.ontology, CreativeWork.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.publishingPrinciples.Properties
}
