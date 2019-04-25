package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object noBylinesPolicy
    extends PropertyDef(
      iri = "http://schema.org/noBylinesPolicy",
      iris = Set("http://schema.org/noBylinesPolicy"),
      label = "noBylinesPolicy",
      comment =
        """For a <a class="localLink" href="http://schema.org/NewsMediaOrganization">NewsMediaOrganization</a> or other news-related <a class="localLink" href="http://schema.org/Organization">Organization</a>, a statement explaining when authors of articles are not named in bylines.""",
      `@extends` = () => List(publishingPrinciples.property),
      `@range` = () => List(URL.ontology, CreativeWork.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties extends lspace.ns.vocab.schema.publishingPrinciples.Properties
}
