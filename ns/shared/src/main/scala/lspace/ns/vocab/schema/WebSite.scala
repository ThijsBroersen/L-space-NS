package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object WebSite
    extends OntologyDef(
      iri = "http://schema.org/WebSite",
      iris = Set("http://schema.org/WebSite"),
      label = "WebSite",
      comment =
        """A WebSite is a set of related web pages and other items typically served from a single web domain and accessible via URLs.""",
      `@extends` = () => List(CreativeWork.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.CreativeWork.Properties {
    lazy val issn = lspace.ns.vocab.schema.issn.property
  }
  override lazy val properties: List[LProperty] = List(issn)
  trait Properties extends lspace.ns.vocab.schema.CreativeWork.Properties {
    lazy val issn = lspace.ns.vocab.schema.issn.property
  }
}
