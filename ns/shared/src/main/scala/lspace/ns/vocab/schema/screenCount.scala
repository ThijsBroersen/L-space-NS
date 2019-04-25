package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object screenCount
    extends PropertyDef(
      iri = "http://schema.org/screenCount",
      iris = Set("http://schema.org/screenCount"),
      label = "screenCount",
      comment = """The number of screens in the movie theater.""",
      `@extends` = () => List(),
      `@range` = () => List(Number.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
