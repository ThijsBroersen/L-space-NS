package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object WebPage
    extends OntologyDef(
      iri = "http://schema.org/WebPage",
      iris = Set("http://schema.org/WebPage"),
      label = "WebPage",
      comment =
        """A web page. Every web page is implicitly assumed to be declared to be of type WebPage, so the various properties about that webpage, such as <code>breadcrumb</code> may be used. We recommend explicit declaration if these properties are specified, but if they are found outside of an itemscope, they will be assumed to be about the page.""",
      `@extends` = () => List(CreativeWork.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.CreativeWork.Properties {
    lazy val primaryImageOfPage = lspace.ns.vocab.schema.primaryImageOfPage.property
    lazy val relatedLink        = lspace.ns.vocab.schema.relatedLink.property
    lazy val specialty          = lspace.ns.vocab.schema.specialty.property
    lazy val significantLinks   = lspace.ns.vocab.schema.significantLinks.property
    lazy val reviewedBy         = lspace.ns.vocab.schema.reviewedBy.property
    lazy val mainContentOfPage  = lspace.ns.vocab.schema.mainContentOfPage.property
    lazy val significantLink    = lspace.ns.vocab.schema.significantLink.property
  }
  override lazy val properties: List[Property] =
    List(primaryImageOfPage, relatedLink, specialty, significantLinks, reviewedBy, mainContentOfPage, significantLink)
  trait Properties extends lspace.ns.vocab.schema.CreativeWork.Properties {
    lazy val primaryImageOfPage = lspace.ns.vocab.schema.primaryImageOfPage.property
    lazy val relatedLink        = lspace.ns.vocab.schema.relatedLink.property
    lazy val specialty          = lspace.ns.vocab.schema.specialty.property
    lazy val significantLinks   = lspace.ns.vocab.schema.significantLinks.property
    lazy val reviewedBy         = lspace.ns.vocab.schema.reviewedBy.property
    lazy val mainContentOfPage  = lspace.ns.vocab.schema.mainContentOfPage.property
    lazy val significantLink    = lspace.ns.vocab.schema.significantLink.property
  }
}
