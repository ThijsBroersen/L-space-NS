package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object xpath
    extends PropertyDef(
      iri = "http://schema.org/xpath",
      iris = Set("http://schema.org/xpath"),
      label = "xpath",
      comment =
        """An XPath, e.g. of a <a class="localLink" href="http://schema.org/SpeakableSpecification">SpeakableSpecification</a> or <a class="localLink" href="http://schema.org/WebPageElement">WebPageElement</a>. In the latter case, multiple matches within a page can constitute a single conceptual "Web page element".""",
      `@extends` = () => List(),
      `@range` = () => List(XPathType.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
