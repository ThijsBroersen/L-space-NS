package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object correctionsPolicy
    extends PropertyDef(
      iri = "http://schema.org/correctionsPolicy",
      iris = Set("http://schema.org/correctionsPolicy"),
      label = "correctionsPolicy",
      comment =
        """For an <a class="localLink" href="http://schema.org/Organization">Organization</a> (e.g. <a class="localLink" href="http://schema.org/NewsMediaOrganization">NewsMediaOrganization</a>), a statement describing (in news media, the newsroom’s) disclosure and correction policy for errors.""",
      `@extends` = () => List(publishingPrinciples.property),
      `@range` = () => List(URL.ontology, CreativeWork.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.publishingPrinciples.Properties
}
