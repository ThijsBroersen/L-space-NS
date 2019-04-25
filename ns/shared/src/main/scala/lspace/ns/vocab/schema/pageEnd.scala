package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object pageEnd
    extends PropertyDef(
      iri = "http://schema.org/pageEnd",
      iris = Set("http://schema.org/pageEnd"),
      label = "pageEnd",
      comment = """The page on which the work ends; for example "138" or "xvi".""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology, Integer.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
