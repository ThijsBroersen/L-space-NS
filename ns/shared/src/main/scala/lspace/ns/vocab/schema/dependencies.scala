package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object dependencies
    extends PropertyDef(
      iri = "http://schema.org/dependencies",
      iris = Set("http://schema.org/dependencies"),
      label = "dependencies",
      comment = """Prerequisites needed to fulfill steps in article.""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
