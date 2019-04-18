package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object wordCount
    extends PropertyDef(
      iri = "http://schema.org/wordCount",
      iris = Set("http://schema.org/wordCount"),
      label = "wordCount",
      comment = """The number of words in the text of the Article.""",
      `@extends` = () => List(),
      `@range` = () => List(Integer.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
