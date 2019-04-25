package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object softwareVersion
    extends PropertyDef(
      iri = "http://schema.org/softwareVersion",
      iris = Set("http://schema.org/softwareVersion"),
      label = "softwareVersion",
      comment = """Version of the software instance.""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
