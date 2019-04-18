package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object keywords
    extends PropertyDef(
      iri = "http://schema.org/keywords",
      iris = Set("http://schema.org/keywords"),
      label = "keywords",
      comment =
        """Keywords or tags used to describe this content. Multiple entries in a keywords list are typically delimited by commas.""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
