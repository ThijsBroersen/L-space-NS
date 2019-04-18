package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object educationalFramework
    extends PropertyDef(
      iri = "http://schema.org/educationalFramework",
      iris = Set("http://schema.org/educationalFramework"),
      label = "educationalFramework",
      comment = """The framework to which the resource being described is aligned.""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
