package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object departurePlatform
    extends PropertyDef(
      iri = "http://schema.org/departurePlatform",
      iris = Set("http://schema.org/departurePlatform"),
      label = "departurePlatform",
      comment = """The platform from which the train departs.""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
