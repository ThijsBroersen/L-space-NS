package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object reviewedBy
    extends PropertyDef(
      iri = "http://schema.org/reviewedBy",
      iris = Set("http://schema.org/reviewedBy"),
      label = "reviewedBy",
      comment =
        """People or organizations that have reviewed the content on this web page for accuracy and/or completeness.""",
      `@extends` = () => List(),
      `@range` = () => List(Person.ontology, Organization.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
