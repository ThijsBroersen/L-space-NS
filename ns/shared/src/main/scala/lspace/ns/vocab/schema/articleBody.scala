package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object articleBody
    extends PropertyDef(
      iri = "http://schema.org/articleBody",
      iris = Set("http://schema.org/articleBody"),
      label = "articleBody",
      comment = """The actual body of the article.""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
