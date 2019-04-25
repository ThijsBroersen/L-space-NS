package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object arrivalPlatform
    extends PropertyDef(
      iri = "http://schema.org/arrivalPlatform",
      iris = Set("http://schema.org/arrivalPlatform"),
      label = "arrivalPlatform",
      comment = """The platform where the train arrives.""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
